package com.example.myapplication;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.gson.Gson;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.nio.file.attribute.AttributeView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class MainActivity extends AppCompatActivity {
    private NewCourseDetailBean newCourseDetailBean;
    private TextView tv_shop_price, tv_shop_attr;
    private List<NewCourseDetailBean.DataBean.GoodsBean.GoodsSkuBean> goodsSku;
    private List<NewCourseDetailBean.DataBean.GoodsBean.SpecItemsBean> specItems;
    private HashMap<Object, Object> map;
    private TextView goInput;
    private ArrayList<String> strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tv = findViewById(R.id.tv);
        Logger.addLogAdapter(new AndroidLogAdapter());
        String json = new Data().getData();
        newCourseDetailBean = new Gson().fromJson(json, NewCourseDetailBean.class);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupWindow();
            }
        });
    }

    /**
     * 商品属性弹窗
     */
    private void showPopupWindow() {
        specItems = newCourseDetailBean.getData().getGoods().getSpecItems();
        goodsSku = newCourseDetailBean.getData().getGoods().getGoodsSku();
        //构建数据
        map = new HashMap<>();
        strings = new ArrayList<>();
        for (int i = 0; i < specItems.size(); i++) {
            strings.add(i, "");
        }
        Logger.i("------初始化的名称----" + strings.toString());
        // 一个自定义的布局，作为显示的内容
        final MyDialog mBottomSheetDialog = new MyDialog(MainActivity.this, R.style.GoodDialog);
        //设置退出速度
        mBottomSheetDialog.outDuration(100);
        mBottomSheetDialog.inDuration(100);
        //设置铺满
        mBottomSheetDialog.heightParam(ViewGroup.LayoutParams.WRAP_CONTENT);
        //解析视图
        View contentView = LayoutInflater.from(MainActivity.this).inflate(R.layout.product_pop_items, null);
        //设置视图
        mBottomSheetDialog.setContentView(contentView);
        goInput = (TextView) contentView.findViewById(R.id.btn_buy_input_message);
        tv_shop_price = contentView.findViewById(R.id.tv_shop_price);
        tv_shop_attr = contentView.findViewById(R.id.tv_shop_attr);
        RecyclerView rv_list = contentView.findViewById(R.id.rv_list);
        AttrLayout linearLayoutManager = new AttrLayout(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv_list.setLayoutManager(linearLayoutManager);
        rv_list.setAdapter(new SkuAdapter(R.layout.product_items, specItems));
        goInput.setOnClickListener(v -> setGoInput(1, mBottomSheetDialog));
        mBottomSheetDialog.show();
    }

    public class SkuAdapter extends BaseQuickAdapter<NewCourseDetailBean.DataBean.GoodsBean.SpecItemsBean, BaseViewHolder> {
        public SkuAdapter(int layoutResId, @Nullable List<NewCourseDetailBean.DataBean.GoodsBean.SpecItemsBean> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, NewCourseDetailBean.DataBean.GoodsBean.SpecItemsBean item) {
            final TagFlowLayout rlShopColor = helper.getView(R.id.rl_shop_section);
            TextView tv_xueduan = helper.getView(R.id.tv_xueduan);
            rlShopColor.setMaxSelectCount(1);
            final ArrayList<String> mVals = new ArrayList<>();
            final List<NewCourseDetailBean.DataBean.GoodsBean.SpecItemsBean.ItemsBean> items = item.getItems();
            for (NewCourseDetailBean.DataBean.GoodsBean.SpecItemsBean.ItemsBean info : items) {
                mVals.add(info.getName());
            }
            tv_xueduan.setText(item.getName());
            rlShopColor.setAdapter(new TagAdapter<String>(mVals) {
                @Override
                public View getView(FlowLayout parent, int position, String s) {
                    TextView textView = (TextView) LayoutInflater.from(mContext).inflate(R.layout.tag_item2, rlShopColor, false);
                    textView.setText(s);
                    return textView;
                }
            });
            rlShopColor.setOnSelectListener(selectPosSet -> {
                if (selectPosSet.isEmpty()) {
                    Logger.i("------没选----");
                } else {
                    for (Integer in : selectPosSet) {
                        int pId = item.getId();
                        int id = items.get(in).getId();
                        map.put(pId, pId + "-" + id);
                        attributeView(in, item);
                        Logger.i("------类型选择学段----" + pId + "-" + id);
                    }
                }
            });
        }
    }

    private void attributeView(int in, NewCourseDetailBean.DataBean.GoodsBean.SpecItemsBean item) {
        Collection<Object> values = map.values();
        List<Object> valueList = new ArrayList<Object>(values);
        for (int i = 0; i < specItems.size(); i++) {
            if (item.getId() == specItems.get(i).getId()) {
                strings.set(i, item.getItems().get(in).getName());
            }
        }
        Logger.i("------111----" + valueList.toString());
        Logger.i("------选择的名称----" + strings.toString());
        StringBuilder mystr = new StringBuilder();
        for (String s : strings) {
            if (!s.equals("")) {
                mystr.append(s).append(" ");
            }
        }
        tv_shop_attr.setText(mystr);
        Logger.i("------要显示的东西----" + mystr);
        if (specItems.size() == valueList.size()) {
            for (NewCourseDetailBean.DataBean.GoodsBean.GoodsSkuBean specPrice : goodsSku) {
                String[] specIdArray = specPrice.getSpecs().split(",");
                List<String> specIdList = Arrays.asList(specIdArray);
                Logger.i("------222----" + specIdList.toString());
                //500-502, 491-493, 503-505, 497-499, 494-495, 506-507]
                if (specIdList.size() == valueList.size() && specIdList.containsAll(valueList)) {
                    String price = specPrice.getPrice();
                    tv_shop_price.setText(price);
                    goInput.setBackgroundResource(R.drawable.default_button_background_selector2);
                    Logger.i("------最终选择----" + valueList.toString());
                    Logger.i("------最终id----" + specPrice.getId());
                }
            }
        }
    }

    private void setGoInput(int type, Dialog mBottomSheetDialog) {
        Collection<Object> values = map.values();
        List<Object> valueList = new ArrayList<Object>(values);
        if (specItems.size() != valueList.size()) {
            Toast.makeText(MainActivity.this, "请选择规格", Toast.LENGTH_SHORT).show();
        } else {
            for (NewCourseDetailBean.DataBean.GoodsBean.GoodsSkuBean specPrice : goodsSku) {
                String[] specIdArray = specPrice.getSpecs().split(",");
                List<String> specIdList = Arrays.asList(specIdArray);
                if (specIdList.size() == valueList.size() && specIdList.containsAll(valueList)) {
//                        goodSKUId = specPrice.getId();
                    Logger.i("------最终选择----" + valueList.toString());
                    Logger.i("------最终id----" + specPrice.getId());
                }
            }
            if (type == 1) {
//                    buyCourseHaveAttr();
            }
            mBottomSheetDialog.dismiss();
        }
    }
}
