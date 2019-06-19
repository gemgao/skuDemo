# 仿淘宝京东商品规格属性选择的最简单实现 #
  商城里面的规格选择，网上大部分是自定义控件实现的，显得很是麻烦，而我的实现方式是大家最常用的控件RecyclerView，特点是性能好，简单。废话不多说，先看实现的效果图：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190618113344153.gif)
上图效果的实现主要是 RecyclerView和flowlayout（流式布局）.

> RecyclerView设置最大高度

如图规格多的时候，RecyclerView要有个最大高度，我们设置` android:maxHeight="300dp"`是没有效果的，因为RecyclerView没有maxHigh这个属性，那怎么实现这个效果呢？通过查看源码，
    
	@Override
	protected void onMeasure(int widthSpec, int heightSpec) {
    ...
    if (mLayout.mAutoMeasure) {
        ...
        // now we can get the width and height from the children.
        mLayout.setMeasuredDimensionFromChildren(widthSpec, heightSpec);
        if (mLayout.shouldMeasureTwice()) {
            ...        
            // now we can get the width and height from the children.
            mLayout.setMeasuredDimensionFromChildren(widthSpec, heightSpec);
        }
    } else {
      ...
    }
	}
当RecyclerView的LayoutManager#isAutoMeasureEnabled()返回true时，RecyclerView高度取决于children view的布局高度，并非取决于RecyclerView自身的测量高度。



> 下面是setMeasuredDimensionFromChildren(int widthSpec, int heightSpec)源码
   
	 void setMeasuredDimensionFromChildren(int widthSpec, int heightSpec) {
    final int count = getChildCount();
    if (count == 0) {
        mRecyclerView.defaultOnMeasure(widthSpec, heightSpec);
        return;
    }
    int minX = Integer.MAX_VALUE;
    int minY = Integer.MAX_VALUE;
    int maxX = Integer.MIN_VALUE;
    int maxY = Integer.MIN_VALUE;
    for (int i = 0; i < count; i++) {
        View child = getChildAt(i);
        final Rect bounds = mRecyclerView.mTempRect;
        getDecoratedBoundsWithMargins(child, bounds);
        if (bounds.left < minX) {
            minX = bounds.left;
        }
        if (bounds.right > maxX) {
            maxX = bounds.right;
        }
        if (bounds.top < minY) {
            minY = bounds.top;
        }
        if (bounds.bottom > maxY) {
            maxY = bounds.bottom;
        }
    }
    mRecyclerView.mTempRect.set(minX, minY, maxX, maxY);
    setMeasuredDimension(mRecyclerView.mTempRect, widthSpec, heightSpec);
	}
该方法计算了RecyclerView当前所有Child View的布局范围mRecyclerView.mTempRect，最后调用了public void setMeasuredDimension(Rect childrenBounds, int wSpec, int hSpec)，并将得出的布局范围mRecyclerView.mTempRect、RecyclerView的测量参数widthSpec、heightSpec作为参数传入，以此来决定RecyclerView最终宽高值。

## 最终解决方法 ##
因此，我们只需要重写LayoutManager的public void setMeasuredDimension(Rect childrenBounds, int wSpec, int hSpec)方法即可为RecyclerView设置最大宽高。
	
	` @Override
    public void setMeasuredDimension(Rect childrenBounds, int wSpec, int hSpec) {
        super.setMeasuredDimension(childrenBounds, wSpec, View.MeasureSpec.makeMeasureSpec(DeviceUtil.dp2px(mContext,246), AT_MOST));
    }`

> 属性的标签实现

标签的实现用的是[flowlayout](https://github.com/hongyangAndroid/FlowLayout )，用法很简单，这里就不在描述了。

至此，如图的效果就实现了，还有不懂的可看demo代码。

[查看源码](https://github.com/gemgao/skuDemo)
