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
import androidx.lifecycle.LifecycleOwner;
import com.mooc.ppjoke.model.Feed;
import com.mooc.ppjoke.view.PPImageView;

public abstract class LayoutFeedTypeImageBinding extends ViewDataBinding {
  @NonNull
  public final PPImageView feedImage;

  @NonNull
  public final LayoutFeedInteractionBinding interactionBinding;

  @Bindable
  protected Feed mFeed;

  @Bindable
  protected LifecycleOwner mLifeCycleOwner;

  protected LayoutFeedTypeImageBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, PPImageView feedImage,
      LayoutFeedInteractionBinding interactionBinding) {
    super(_bindingComponent, _root, _localFieldCount);
    this.feedImage = feedImage;
    this.interactionBinding = interactionBinding;
    setContainedBinding(this.interactionBinding);;
  }

  public abstract void setFeed(@Nullable Feed feed);

  @Nullable
  public Feed getFeed() {
    return mFeed;
  }

  public abstract void setLifeCycleOwner(@Nullable LifecycleOwner lifeCycleOwner);

  @Nullable
  public LifecycleOwner getLifeCycleOwner() {
    return mLifeCycleOwner;
  }

  @NonNull
  public static LayoutFeedTypeImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedTypeImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedTypeImageBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_type_image, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutFeedTypeImageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedTypeImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedTypeImageBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_type_image, null, false, component);
  }

  public static LayoutFeedTypeImageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutFeedTypeImageBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutFeedTypeImageBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_feed_type_image);
  }
}
