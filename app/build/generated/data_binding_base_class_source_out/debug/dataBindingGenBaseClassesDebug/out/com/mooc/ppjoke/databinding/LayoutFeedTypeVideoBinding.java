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
import com.mooc.ppjoke.view.ListPlayerView;

public abstract class LayoutFeedTypeVideoBinding extends ViewDataBinding {
  @NonNull
  public final LayoutFeedInteractionBinding interactionBinding;

  @NonNull
  public final ListPlayerView listPlayerView;

  @Bindable
  protected Feed mFeed;

  @Bindable
  protected LifecycleOwner mLifeCycleOwner;

  protected LayoutFeedTypeVideoBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LayoutFeedInteractionBinding interactionBinding,
      ListPlayerView listPlayerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.interactionBinding = interactionBinding;
    setContainedBinding(this.interactionBinding);;
    this.listPlayerView = listPlayerView;
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
  public static LayoutFeedTypeVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedTypeVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedTypeVideoBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_type_video, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutFeedTypeVideoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedTypeVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedTypeVideoBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_type_video, null, false, component);
  }

  public static LayoutFeedTypeVideoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutFeedTypeVideoBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutFeedTypeVideoBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_feed_type_video);
  }
}
