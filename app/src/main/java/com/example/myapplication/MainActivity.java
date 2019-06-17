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
    private TextView tv_shop_price, tv_shop_attr,tv_shop_name;
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
        String json = "{\"msg\":\"success\",\"code\":200,\"data\":{\"course\":{\"courseId\":51,\"courseCount\":0,\"courseStartTime\":1558592093000,\"courseEndTime\":1562860800000,\"courseCate\":0,\"totalNum\":0,\"favorableRate\":0.00,\"ascription\":1,\"online\":1,\"isAudition\":false,\"agreement\":0,\"scheduleGroup\":0,\"startLearning\":false,\"teachers\":[{\"teacherId\":6,\"name\":\"超级飞侠\",\"thumbnail\":\"http://files.danglaoshi.net/1557992134469.png\",\"introduce\":\"智慧型女神，教资考试阅卷组成员，六年行业辅导经验，深谙解题之道，擅长材料分析题指导，能抽丝剥茧，在繁杂素材中快速抽取关键信息，四两拨千斤化解疑难问题。\",\"slogan\":\"材料题\\\"女王\\\"，快速抽取关键信息\",\"score\":5.0}]},\"goods\":{\"goodId\":46,\"goodsName\":\"高祯测试勿动\",\"type\":null,\"productId\":null,\"banner\":\"http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-3383500ed39146b1b058a00a04e8040b.png\",\"sellStartTime\":1558591976000,\"sellEndTime\":1567094400000,\"payCount\":38,\"limitCount\":-1,\"limitBuyNum\":0,\"goodsSku\":[{\"id\":990,\"goodsId\":46,\"specs\":\"520-521,523-524,526-527,529-531,532-533,535-536\",\"price\":1.00,\"stock\":1},{\"id\":991,\"goodsId\":46,\"specs\":\"520-521,523-524,526-527,529-531,532-533,535-537\",\"price\":1.00,\"stock\":1},{\"id\":992,\"goodsId\":46,\"specs\":\"520-521,523-524,526-527,529-531,532-534,535-536\",\"price\":1.00,\"stock\":1},{\"id\":993,\"goodsId\":46,\"specs\":\"520-521,523-524,526-527,529-531,532-534,535-537\",\"price\":1.00,\"stock\":1},{\"id\":994,\"goodsId\":46,\"specs\":\"520-521,523-524,526-527,529-531,532-533,535-536\",\"price\":1.00,\"stock\":1},{\"id\":995,\"goodsId\":46,\"specs\":\"520-521,523-524,526-527,529-531,532-533,535-537\",\"price\":1.00,\"stock\":1},{\"id\":996,\"goodsId\":46,\"specs\":\"520-521,523-524,526-527,529-531,532-534,535-536\",\"price\":2.00,\"stock\":1},{\"id\":997,\"goodsId\":46,\"specs\":\"520-521,523-524,526-527,529-531,532-534,535-537\",\"price\":121.00,\"stock\":1},{\"id\":998,\"goodsId\":46,\"specs\":\"520-521,523-524,526-528,529-531,532-533,535-536\",\"price\":1.00,\"stock\":12},{\"id\":999,\"goodsId\":46,\"specs\":\"520-521,523-524,526-528,529-531,532-533,535-537\",\"price\":125.00,\"stock\":21232},{\"id\":1000,\"goodsId\":46,\"specs\":\"520-521,523-524,526-528,529-531,532-534,535-536\",\"price\":231.00,\"stock\":213125},{\"id\":1001,\"goodsId\":46,\"specs\":\"520-521,523-524,526-528,529-531,532-534,535-537\",\"price\":15.00,\"stock\":2135},{\"id\":1002,\"goodsId\":46,\"specs\":\"520-521,523-524,526-528,529-531,532-533,535-536\",\"price\":125.00,\"stock\":12},{\"id\":1003,\"goodsId\":46,\"specs\":\"520-521,523-524,526-528,529-531,532-533,535-537\",\"price\":38.00,\"stock\":121},{\"id\":1004,\"goodsId\":46,\"specs\":\"520-521,523-524,526-528,529-531,532-534,535-536\",\"price\":5.00,\"stock\":126},{\"id\":1005,\"goodsId\":46,\"specs\":\"520-521,523-524,526-528,529-531,532-534,535-537\",\"price\":15.00,\"stock\":2},{\"id\":1006,\"goodsId\":46,\"specs\":\"520-521,523-525,526-527,529-531,532-533,535-536\",\"price\":516.00,\"stock\":122},{\"id\":1007,\"goodsId\":46,\"specs\":\"520-521,523-525,526-527,529-531,532-533,535-537\",\"price\":146.00,\"stock\":612},{\"id\":1008,\"goodsId\":46,\"specs\":\"520-521,523-525,526-527,529-531,532-534,535-536\",\"price\":55.00,\"stock\":65110},{\"id\":1009,\"goodsId\":46,\"specs\":\"520-521,523-525,526-527,529-531,532-534,535-537\",\"price\":15656.00,\"stock\":56},{\"id\":1010,\"goodsId\":46,\"specs\":\"520-521,523-525,526-527,529-531,532-533,535-536\",\"price\":56.00,\"stock\":5},{\"id\":1011,\"goodsId\":46,\"specs\":\"520-521,523-525,526-527,529-531,532-533,535-537\",\"price\":25.00,\"stock\":62},{\"id\":1012,\"goodsId\":46,\"specs\":\"520-521,523-525,526-527,529-531,532-534,535-536\",\"price\":256.00,\"stock\":96},{\"id\":1013,\"goodsId\":46,\"specs\":\"520-521,523-525,526-527,529-531,532-534,535-537\",\"price\":51.00,\"stock\":163},{\"id\":1014,\"goodsId\":46,\"specs\":\"520-521,523-525,526-528,529-531,532-533,535-536\",\"price\":6115.00,\"stock\":15},{\"id\":1015,\"goodsId\":46,\"specs\":\"520-521,523-525,526-528,529-531,532-533,535-537\",\"price\":18.00,\"stock\":1},{\"id\":1016,\"goodsId\":46,\"specs\":\"520-521,523-525,526-528,529-531,532-534,535-536\",\"price\":182.00,\"stock\":1},{\"id\":1017,\"goodsId\":46,\"specs\":\"520-521,523-525,526-528,529-531,532-534,535-537\",\"price\":1.00,\"stock\":961},{\"id\":1018,\"goodsId\":46,\"specs\":\"520-521,523-525,526-528,529-531,532-533,535-536\",\"price\":961.00,\"stock\":63851},{\"id\":1019,\"goodsId\":46,\"specs\":\"520-521,523-525,526-528,529-531,532-533,535-537\",\"price\":41.00,\"stock\":1},{\"id\":1020,\"goodsId\":46,\"specs\":\"520-521,523-525,526-528,529-531,532-534,535-536\",\"price\":1.00,\"stock\":1},{\"id\":1021,\"goodsId\":46,\"specs\":\"520-521,523-525,526-528,529-531,532-534,535-537\",\"price\":196.00,\"stock\":185},{\"id\":1022,\"goodsId\":46,\"specs\":\"520-522,523-524,526-527,529-531,532-533,535-536\",\"price\":1.00,\"stock\":85},{\"id\":1023,\"goodsId\":46,\"specs\":\"520-522,523-524,526-527,529-531,532-533,535-537\",\"price\":851.00,\"stock\":85196},{\"id\":1024,\"goodsId\":46,\"specs\":\"520-522,523-524,526-527,529-531,532-534,535-536\",\"price\":196.00,\"stock\":196},{\"id\":1025,\"goodsId\":46,\"specs\":\"520-522,523-524,526-527,529-531,532-534,535-537\",\"price\":18.00,\"stock\":51},{\"id\":1026,\"goodsId\":46,\"specs\":\"520-522,523-524,526-527,529-531,532-533,535-536\",\"price\":6185.00,\"stock\":185},{\"id\":1027,\"goodsId\":46,\"specs\":\"520-522,523-524,526-527,529-531,532-533,535-537\",\"price\":91.00,\"stock\":8},{\"id\":1028,\"goodsId\":46,\"specs\":\"520-522,523-524,526-527,529-531,532-534,535-536\",\"price\":87.00,\"stock\":56},{\"id\":1029,\"goodsId\":46,\"specs\":\"520-522,523-524,526-527,529-531,532-534,535-537\",\"price\":556.00,\"stock\":546},{\"id\":1030,\"goodsId\":46,\"specs\":\"520-522,523-524,526-528,529-531,532-533,535-536\",\"price\":79.00,\"stock\":456},{\"id\":1031,\"goodsId\":46,\"specs\":\"520-522,523-524,526-528,529-531,532-533,535-537\",\"price\":456.00,\"stock\":56},{\"id\":1032,\"goodsId\":46,\"specs\":\"520-522,523-524,526-528,529-531,532-534,535-536\",\"price\":456.00,\"stock\":456},{\"id\":1033,\"goodsId\":46,\"specs\":\"520-522,523-524,526-528,529-531,532-534,535-537\",\"price\":456.00,\"stock\":456},{\"id\":1034,\"goodsId\":46,\"specs\":\"520-522,523-524,526-528,529-531,532-533,535-536\",\"price\":78.00,\"stock\":78},{\"id\":1035,\"goodsId\":46,\"specs\":\"520-522,523-524,526-528,529-531,532-533,535-537\",\"price\":568.00,\"stock\":9},{\"id\":1036,\"goodsId\":46,\"specs\":\"520-522,523-524,526-528,529-531,532-534,535-536\",\"price\":768.00,\"stock\":876},{\"id\":1037,\"goodsId\":46,\"specs\":\"520-522,523-524,526-528,529-531,532-534,535-537\",\"price\":687.00,\"stock\":678},{\"id\":1038,\"goodsId\":46,\"specs\":\"520-522,523-525,526-527,529-531,532-533,535-536\",\"price\":87.00,\"stock\":6},{\"id\":1039,\"goodsId\":46,\"specs\":\"520-522,523-525,526-527,529-531,532-533,535-537\",\"price\":87.00,\"stock\":54},{\"id\":1040,\"goodsId\":46,\"specs\":\"520-522,523-525,526-527,529-531,532-534,535-536\",\"price\":78.00,\"stock\":456},{\"id\":1041,\"goodsId\":46,\"specs\":\"520-522,523-525,526-527,529-531,532-534,535-537\",\"price\":78956.00,\"stock\":54},{\"id\":1042,\"goodsId\":46,\"specs\":\"520-522,523-525,526-527,529-531,532-533,535-536\",\"price\":546.00,\"stock\":45},{\"id\":1043,\"goodsId\":46,\"specs\":\"520-522,523-525,526-527,529-531,532-533,535-537\",\"price\":54.00,\"stock\":664},{\"id\":1044,\"goodsId\":46,\"specs\":\"520-522,523-525,526-527,529-531,532-534,535-536\",\"price\":546.00,\"stock\":789},{\"id\":1045,\"goodsId\":46,\"specs\":\"520-522,523-525,526-527,529-531,532-534,535-537\",\"price\":87.00,\"stock\":78},{\"id\":1046,\"goodsId\":46,\"specs\":\"520-522,523-525,526-528,529-531,532-533,535-536\",\"price\":5.00,\"stock\":78},{\"id\":1047,\"goodsId\":46,\"specs\":\"520-522,523-525,526-528,529-531,532-533,535-537\",\"price\":654.00,\"stock\":7},{\"id\":1048,\"goodsId\":46,\"specs\":\"520-522,523-525,526-528,529-531,532-534,535-536\",\"price\":7.00,\"stock\":7},{\"id\":1049,\"goodsId\":46,\"specs\":\"520-522,523-525,526-528,529-531,532-534,535-537\",\"price\":877.00,\"stock\":564},{\"id\":1050,\"goodsId\":46,\"specs\":\"520-522,523-525,526-528,529-531,532-533,535-536\",\"price\":8.00,\"stock\":78},{\"id\":1051,\"goodsId\":46,\"specs\":\"520-522,523-525,526-528,529-531,532-533,535-537\",\"price\":6.00,\"stock\":78},{\"id\":1052,\"goodsId\":46,\"specs\":\"520-522,523-525,526-528,529-531,532-534,535-536\",\"price\":6.00,\"stock\":78},{\"id\":1053,\"goodsId\":46,\"specs\":\"520-522,523-525,526-528,529-531,532-534,535-537\",\"price\":6.00,\"stock\":78}],\"specItems\":[{\"id\":529,\"name\":\"测试4\",\"items\":[{\"id\":530,\"name\":\"测试4-1\",\"items\":null},{\"id\":531,\"name\":\"测试4-1\",\"items\":null}]},{\"id\":532,\"name\":\"测试5\",\"items\":[{\"id\":533,\"name\":\"测试5-1\",\"items\":null},{\"id\":534,\"name\":\"测试5-2\",\"items\":null}]},{\"id\":535,\"name\":\"测试6\",\"items\":[{\"id\":536,\"name\":\"测试6-1\",\"items\":null},{\"id\":537,\"name\":\"测试6-2\",\"items\":null}]},{\"id\":520,\"name\":\"测试1\",\"items\":[{\"id\":521,\"name\":\"测试1-1\",\"items\":null},{\"id\":522,\"name\":\"测试1-2\",\"items\":null}]},{\"id\":523,\"name\":\"测试2\",\"items\":[{\"id\":524,\"name\":\"测试2-1\",\"items\":null},{\"id\":525,\"name\":\"测试2-2\",\"items\":null}]},{\"id\":526,\"name\":\"测试3\",\"items\":[{\"id\":527,\"name\":\"测试3-1\",\"items\":null},{\"id\":528,\"name\":\"测试3-2\",\"items\":null}]}],\"productStatus\":1,\"exist\":false,\"originalPrice\":null,\"currentPrice\":0.01,\"actualPayMoney\":0.01,\"promotionType\":0,\"timingStartTime\":null,\"timingEndTime\":null,\"timingPrice\":null,\"flashSaleRemainSecond\":null,\"isFrontMoney\":false,\"depositPaid\":false,\"frontMoneyMsg\":\"\",\"frontMoney\":null,\"finalMoney\":null,\"isBatchPay\":false,\"batchMoney\":null,\"batchMoneyList\":null,\"userIsBatchPay\":false,\"hasPromGift\":false,\"promGiftTypeNames\":[],\"promGiftNum\":0,\"promGiftList\":[],\"hasDeduction\":true,\"enablePointsDeduct\":false,\"deductionHoneyNum\":null,\"pointsDeductMoney\":null,\"coupon\":false,\"couponMoney\":0.00,\"isGroupPurchase\":null,\"groupPurchasePrice\":null,\"groupPurchaseStatus\":null,\"groupPurchaseNum\":null,\"groupPurchaseCount\":null,\"goodsGroupPurchaseFoundId\":null,\"groupPurchaseUrl\":null,\"groupPurchaseShareUrl\":null,\"isAdvisory\":false,\"advisoryList\":null,\"qidianServiceUrl\":null,\"qqId\":null,\"androidKey\":null,\"iphoneKey\":null,\"pageKey\":null,\"needBuyerInfo\":false,\"needUserContact\":false,\"isShip\":true,\"vip\":false,\"isVipPeculiar\":false,\"studentVipPrice\":null,\"iphoneId\":\"1\",\"redirectType\":0,\"jobProtect\":0,\"jobSelected\":null,\"jobId\":null,\"jobDesc\":null,\"share\":1,\"shareUrl\":\"http://h5.test.danglaoshi.net/course_detail?goodId=46&sharerId=1123&sharerNick=%E4%BD%A9%E4%BD%A9\"}},\"timestamp\":1560753353293}";
//        String json = "{\"msg\":\"success\",\"code\":200,\"data\":{\"course\":{\"courseId\":70,\"courseCount\":15,\"courseStartTime\":1559113409000,\"courseEndTime\":1561824000000,\"courseCate\":0,\"totalNum\":0,\"favorableRate\":0.00,\"ascription\":1,\"online\":1,\"isAudition\":false,\"agreement\":0,\"scheduleGroup\":0,\"startLearning\":false,\"teachers\":[{\"teacherId\":2,\"name\":\"宋词老师\",\"thumbnail\":\"http://pic.danglaoshi.net/live/teacher/avatar_2_8e5965d00a41dca354ce0f197678ea8624a7f8fe.png\",\"introduce\":\"当老师掌门人，八年行业辅导经验，擅长作文写作，自创万能高分模板式写作方法，速成秘笈拯救千万弟子，一招毙敌，以不变才能应万变。凭借专业、负责的教学特点，被粉丝亲切的称为“多肉型治愈系暖男”。\",\"slogan\":\"结构化写作模式\\\"创导者\\\"\",\"score\":3.9},{\"teacherId\":27,\"name\":\"当老师名师\",\"thumbnail\":\"http://files.danglaoshi.net/image/a3e2e49d-7704-4872-a0a6-cf8917eda59f.png\",\"introduce\":\"这是当老师名师呀~\",\"slogan\":\"名师在手，天下我有！\",\"score\":null},{\"teacherId\":29,\"name\":\"王老师\",\"thumbnail\":\"http://files.danglaoshi.net/1541419090393.png\",\"introduce\":\"111\",\"slogan\":\"经验丰富，优秀讲师\",\"score\":4.0},{\"teacherId\":3,\"name\":\"高雅\",\"thumbnail\":\"http://pic.danglaoshi.net/live/teacher/avatar_3_da25b26d7d65551d5ecf9db5ac07281241ff1f18.png\",\"introduce\":\"一个用生命在逗逼的段子手老师，用幽默带你玩转法律。致力于教师资格证出题形式研究，擅长将知识点简单粗暴地灌输给教师路上的你。政治学理论专业研究生毕业，主讲法律。\",\"slogan\":\"用幽默带你玩转法律\",\"score\":2.6}]},\"goods\":{\"goodId\":71,\"goodsName\":\"规格商品测试长度测试是杀死后死死死死死试试死死死撒娇就撒娇很少见阿斯哈赛后赛欧活塞哦哈死吧\",\"type\":null,\"productId\":null,\"banner\":\"http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-cb742daa9e1c483693776337a25c5cae.png\",\"sellStartTime\":1559113574000,\"sellEndTime\":1561824000000,\"payCount\":126,\"limitCount\":500,\"limitBuyNum\":15,\"goodsSku\":[{\"id\":1054,\"goodsId\":71,\"specs\":\"538-539,541-542\",\"price\":1.00,\"stock\":324},{\"id\":1055,\"goodsId\":71,\"specs\":\"538-539,541-543\",\"price\":3.00,\"stock\":234},{\"id\":1056,\"goodsId\":71,\"specs\":\"538-540,541-542\",\"price\":234.00,\"stock\":34},{\"id\":1057,\"goodsId\":71,\"specs\":\"538-540,541-543\",\"price\":2.00,\"stock\":423}],\"specItems\":[{\"id\":538,\"name\":\"学段\",\"items\":[{\"id\":539,\"name\":\"小学\",\"items\":null},{\"id\":540,\"name\":\"中学\",\"items\":null}]},{\"id\":541,\"name\":\"科目\",\"items\":[{\"id\":542,\"name\":\"小学\",\"items\":null},{\"id\":543,\"name\":\"中学\",\"items\":null}]}],\"productStatus\":1,\"exist\":false,\"originalPrice\":122.00,\"currentPrice\":0.02,\"actualPayMoney\":0.02,\"promotionType\":0,\"timingStartTime\":null,\"timingEndTime\":null,\"timingPrice\":null,\"flashSaleRemainSecond\":null,\"isFrontMoney\":false,\"depositPaid\":false,\"frontMoneyMsg\":\"\",\"frontMoney\":null,\"finalMoney\":null,\"isBatchPay\":false,\"batchMoney\":null,\"batchMoneyList\":null,\"userIsBatchPay\":false,\"hasPromGift\":false,\"promGiftTypeNames\":[],\"promGiftNum\":0,\"promGiftList\":[],\"hasDeduction\":true,\"enablePointsDeduct\":true,\"deductionHoneyNum\":20,\"pointsDeductMoney\":0.02,\"coupon\":false,\"couponMoney\":0.00,\"isGroupPurchase\":null,\"groupPurchasePrice\":null,\"groupPurchaseStatus\":null,\"groupPurchaseNum\":null,\"groupPurchaseCount\":null,\"goodsGroupPurchaseFoundId\":null,\"groupPurchaseUrl\":null,\"groupPurchaseShareUrl\":null,\"isAdvisory\":true,\"advisoryList\":{\"type\":null,\"qqId\":\"839618830\",\"androidKey\":\"annMsUykGfQFEKPl9EzA4j2IIrlD2BMm\",\"iphoneKey\":\"1f7ffa070e38f1d433017c61fd3d104d62fdda4093b91e504d8d75267a1c82b9\",\"pageKey\":\"1f7ffa070e38f1d433017c61fd3d104d62fdda4093b91e504d8d75267a1c82b9\",\"wechatId\":\"\",\"wechatName\":\"\",\"wechatPhoto\":\"\",\"wechatQrcode\":\"\",\"phone\":null,\"thirdPartyId\":\"\",\"qidianServiceUrl\":null},\"qidianServiceUrl\":null,\"qqId\":\"1102470770\",\"androidKey\":\"JY1df2j3kfIKVPhBwqawhWt8ober8Cn7\",\"iphoneKey\":\"aPo-NNz0Uxsc5tFXY7YJVkUOXKQAaect\",\"pageKey\":\"JY1df2j3kfIKVPhBwqawhWt8ober8Cn7\",\"needBuyerInfo\":false,\"needUserContact\":true,\"isShip\":true,\"vip\":false,\"isVipPeculiar\":false,\"studentVipPrice\":null,\"iphoneId\":\"\",\"redirectType\":0,\"jobProtect\":0,\"jobSelected\":null,\"jobId\":null,\"jobDesc\":null,\"share\":1,\"shareUrl\":\"http://h5.test.danglaoshi.net/course_detail?goodId=71&sharerId=1123&sharerNick=%E4%BD%A9%E4%BD%A9\"}},\"timestamp\":1560756204468}";
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
        tv_shop_name = contentView.findViewById(R.id.tv_shop_name);
        tv_shop_name.setText(newCourseDetailBean.getData().getGoods().getGoodsName());
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
