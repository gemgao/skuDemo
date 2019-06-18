package com.example.myapplication;

import java.io.Serializable;
import java.util.List;

/**
 * Created by TTT on 2019/5/14.
 */

public class NewCourseDetailBean implements Serializable {


    /**
     * msg : success
     * code : 200
     * data : {"course":{"courseId":null,"courseCount":null,"courseStartTime":null,"courseEndTime":null,"courseCate":0,"totalNum":0,"favorableRate":0,"ascription":null,"online":null,"isAudition":null,"agreement":null,"scheduleGroup":0},"goods":{"goodId":1,"goodsName":"商品1_new","banner":"http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-91d019bbbd73492386e3cbe5d5982ec7.png","sellStartTime":1557036248000,"sellEndTime":1557036251000,"payCount":11,"limitCount":2,"limitBuyNum":2,"goodsSku":[{"id":1,"goodsId":1,"specs":"1-4,2-6","price":9.1,"stock":3},{"id":2,"goodsId":1,"specs":"1-4,2-7","price":9.2,"stock":3},{"id":3,"goodsId":1,"specs":"1-4,2-8","price":9.3,"stock":3},{"id":4,"goodsId":1,"specs":"1-5,2-6","price":8.1,"stock":2},{"id":5,"goodsId":1,"specs":"1-5,2-7","price":8.2,"stock":2},{"id":6,"goodsId":1,"specs":"1-5,2-8","price":8.3,"stock":2}],"specItems":[{"id":1,"name":"类型","items":[{"id":4,"name":"教师资格证","items":null}]},{"id":2,"name":"学段","items":[{"id":6,"name":"中学","items":null},{"id":7,"name":"小学","items":null},{"id":8,"name":"幼儿园","items":null}]}],"productStatus":2,"exist":false,"originalPrice":3,"currentPrice":3,"actualPayMoney":3,"promotionType":1,"timingStartTime":1557036267000,"timingEndTime":1557036269000,"timingPrice":3,"flashSaleRemainSecond":null,"isFrontMoney":true,"depositPaid":false,"frontMoneyMsg":null,"frontMoney":2,"finalMoney":1,"isBatchPay":true,"batchMoney":3,"batchMoneyList":null,"hasPromGift":true,"promGiftTypeNames":["模考","商品","礼品","商品"],"promGiftNum":4,"promGiftList":[{"promGiftType":"模考","promGiftName":"test","refId":null},{"promGiftType":"商品","promGiftName":"test","refId":7},{"promGiftType":"礼品","promGiftName":"rr","refId":null},{"promGiftType":"商品","promGiftName":"testet","refId":1}],"hasDeduction":false,"enablePointsDeduct":false,"deductionHoneyNum":0,"pointsDeductMoney":0,"coupon":null,"couponMoney":null,"isGroupPurchase":true,"groupPurchasePrice":500,"isAdvisory":true,"advisoryList":[{"type":null,"qqId":"33","androidKey":"44","iphoneKey":"23","pageKey":"43","wechatId":"433","wechatName":"433","wechatPhoto":"http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-6ea9bc5ae07a490b808e0d76158f16e8.png","wechatQrcode":"http://dlsuser-test.oss-cn-beijing.aliyuncs.com/file-a0cf55feda7945ab8e1b66a8a0f9813a.png","phone":34324,"thirdPartyId":4234234}],"needBuyerInfo":true,"isShip":true,"isVipPeculiar":false,"studentVipPrice":2,"iphoneId":"2222","redirectType":0}}
     * timestamp : 1557821080591
     */

    private String msg;
    private int code;
    private DataBean data;
    private long timestamp;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public static class DataBean implements Serializable {
        private GoodsBean goods;

        public GoodsBean getGoods() {
            return goods;
        }

        public void setGoods(GoodsBean goods) {
            this.goods = goods;
        }

        public static class GoodsBean implements Serializable {
            private List<GoodsSkuBean> goodsSku;
            private List<SpecItemsBean> specItems;

            public List<GoodsSkuBean> getGoodsSku() {
                return goodsSku;
            }

            public void setGoodsSku(List<GoodsSkuBean> goodsSku) {
                this.goodsSku = goodsSku;
            }

            public List<SpecItemsBean> getSpecItems() {
                return specItems;
            }

            public void setSpecItems(List<SpecItemsBean> specItems) {
                this.specItems = specItems;
            }

            public static class GoodsSkuBean implements Serializable {
                /**
                 * id : 1
                 * goodsId : 1
                 * specs : 1-4,2-6
                 * price : 9.1
                 * stock : 3
                 */

                private long id;
                private long goodsId;
                private String specs;
                private String price;
                private int stock;

                public long getId() {
                    return id;
                }

                public void setId(long id) {
                    this.id = id;
                }

                public long getGoodsId() {
                    return goodsId;
                }

                public void setGoodsId(long goodsId) {
                    this.goodsId = goodsId;
                }

                public String getSpecs() {
                    return specs;
                }

                public void setSpecs(String specs) {
                    this.specs = specs;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public int getStock() {
                    return stock;
                }

                public void setStock(int stock) {
                    this.stock = stock;
                }
            }

            public static class SpecItemsBean implements Serializable {
                /**
                 * id : 1
                 * name : 类型
                 * items : [{"id":4,"name":"教师资格证","items":null}]
                 */

                private int id;
                private String name;
                private List<ItemsBean> items;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<ItemsBean> getItems() {
                    return items;
                }

                public void setItems(List<ItemsBean> items) {
                    this.items = items;
                }

                public static class ItemsBean implements Serializable {

                    private int id;
                    private String name;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }
                }
            }
        }
    }
}
