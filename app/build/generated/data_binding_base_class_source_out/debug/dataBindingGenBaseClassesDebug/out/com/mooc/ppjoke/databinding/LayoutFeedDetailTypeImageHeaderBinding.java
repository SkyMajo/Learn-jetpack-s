package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.mooc.ppjoke.model.Feed;
import com.mooc.ppjoke.view.PPImageView;

public abstract class LayoutFeedDetailTypeImageHeaderBinding extends ViewDataBinding {
  @NonNull
  public final PPImageView headerImage;

  @Bindable
  protected Feed mFeed;

  protected LayoutFeedDetailTypeImageHeaderBinding(DataBindingComponent _bindingComponent,
      View _root, int _localFieldCount, PPImageView headerImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.headerImage = headerImage;
  }

  public abstract void setFeed(@Nullable Feed feed);

  @Nullable
  public Feed getFeed() {
    return mFeed;
  }

  @NonNull
  public static LayoutFeedDetailTypeImageHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedDetailTypeImageHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedDetailTypeImageHeaderBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_detail_type_image_header, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutFeedDetailTypeImageHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedDetailTypeImageHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedDetailTypeImageHeaderBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_detail_type_image_header, null, false, component);
  }

  public static LayoutFeedDetailTypeImageHeaderBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutFeedDetailTypeImageHeaderBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutFeedDetailTypeImageHeaderBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_feed_detail_type_image_header);
  }
}
