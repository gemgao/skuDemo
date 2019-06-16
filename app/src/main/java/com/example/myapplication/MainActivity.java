package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.gson.Gson;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String json = "{\"msg\":\"success\",\"code\":200,\"data\":{\"course\":{\"courseId\":86,\"courseCount\":5,\"courseStartTime\":1559699598000,\"courseEndTime\":1562342400000,\"courseCate\":0,\"totalNum\":1,\"favorableRate\":1.00,\"ascription\":1,\"online\":1,\"isAudition\":false,\"agreement\":0,\"scheduleGroup\":0,\"startLearning\":false,\"teachers\":null},\"goods\":{\"goodId\":92,\"goodsName\":\"我的班级排行榜规则奖品-1——规格\",\"type\":null,\"productId\":null,\"banner\":\"http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-3c80864008214f719f62eadc2d2b80e3.jpg\",\"sellStartTime\":1559701344000,\"sellEndTime\":1562342400000,\"payCount\":35,\"limitCount\":100,\"limitBuyNum\":1,\"goodsSku\":[{\"id\":816,\"goodsId\":92,\"specs\":\"459-460,463-464\",\"price\":0.00,\"stock\":1},{\"id\":817,\"goodsId\":92,\"specs\":\"459-460,463-465\",\"price\":2.00,\"stock\":1},{\"id\":818,\"goodsId\":92,\"specs\":\"459-460,463-466\",\"price\":3.00,\"stock\":2},{\"id\":819,\"goodsId\":92,\"specs\":\"459-461,463-464\",\"price\":4.00,\"stock\":3},{\"id\":820,\"goodsId\":92,\"specs\":\"459-461,463-465\",\"price\":5.00,\"stock\":5},{\"id\":821,\"goodsId\":92,\"specs\":\"459-461,463-466\",\"price\":6.00,\"stock\":6},{\"id\":822,\"goodsId\":92,\"specs\":\"459-462,463-464\",\"price\":7.00,\"stock\":7},{\"id\":823,\"goodsId\":92,\"specs\":\"459-462,463-465\",\"price\":8.00,\"stock\":8},{\"id\":824,\"goodsId\":92,\"specs\":\"459-462,463-466\",\"price\":9.00,\"stock\":9}],\"specItems\":[{\"id\":459,\"name\":\"1111111111111\",\"items\":[{\"id\":460,\"name\":\"A\",\"items\":null},{\"id\":461,\"name\":\"B\",\"items\":null},{\"id\":462,\"name\":\"啊啊\",\"items\":null}]},{\"id\":463,\"name\":\"3333333333333\",\"items\":[{\"id\":464,\"name\":\"E\",\"items\":null},{\"id\":465,\"name\":\"F\",\"items\":null},{\"id\":466,\"name\":\"H\",\"items\":null}]}],\"productStatus\":1,\"exist\":false,\"originalPrice\":null,\"currentPrice\":0.50,\"actualPayMoney\":0.50,\"promotionType\":0,\"timingStartTime\":null,\"timingEndTime\":null,\"timingPrice\":null,\"flashSaleRemainSecond\":null,\"isFrontMoney\":false,\"depositPaid\":false,\"frontMoneyMsg\":\"\",\"frontMoney\":null,\"finalMoney\":null,\"isBatchPay\":false,\"batchMoney\":null,\"batchMoneyList\":null,\"userIsBatchPay\":false,\"hasPromGift\":false,\"promGiftTypeNames\":[],\"promGiftNum\":0,\"promGiftList\":[],\"hasDeduction\":true,\"enablePointsDeduct\":true,\"deductionHoneyNum\":10,\"pointsDeductMoney\":0.01,\"coupon\":false,\"couponMoney\":0.00,\"isGroupPurchase\":null,\"groupPurchasePrice\":null,\"groupPurchaseStatus\":null,\"groupPurchaseNum\":null,\"groupPurchaseCount\":null,\"goodsGroupPurchaseFoundId\":null,\"groupPurchaseUrl\":null,\"groupPurchaseShareUrl\":null,\"isAdvisory\":false,\"advisoryList\":null,\"qidianServiceUrl\":null,\"needBuyerInfo\":false,\"needUserContact\":false,\"isShip\":false,\"vip\":false,\"isVipPeculiar\":false,\"studentVipPrice\":null,\"iphoneId\":\"11\",\"redirectType\":0,\"jobProtect\":0,\"jobSelected\":null,\"jobId\":null,\"jobDesc\":null,\"share\":1,\"shareUrl\":\"http://h5.test.danglaoshi.net/course_detail?goodId=92&sharerId=168210&sharerNick=%E9%98%BF%E7%8B%B8\"}},\"timestamp\":1560614971044}";
    private NewCourseDetailBean newCourseDetailBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv);
        Logger.addLogAdapter(new AndroidLogAdapter());
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

        RecyclerView rv_list = contentView.findViewById(R.id.rv_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        List<NewCourseDetailBean.DataBean.GoodsBean.SpecItemsBean> specItems = newCourseDetailBean.getData().getGoods().getSpecItems();
        rv_list.setLayoutManager(linearLayoutManager);
        rv_list.setAdapter(new SkuAdapter(R.layout.product_items, specItems));

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
                        int id = items.get(in).getId();
                        Logger.i("------类型选择学段----"+id);
                    }
                }
            });
            rlShopColor.setOnTagClickListener((view, position, parent) -> {
                Logger.i("------点击了----"+position+"父亲是--"+parent);
                return true;
            });
        }
    }
}
