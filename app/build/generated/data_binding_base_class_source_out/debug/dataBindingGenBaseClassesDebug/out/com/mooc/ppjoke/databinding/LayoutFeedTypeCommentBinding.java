package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.mooc.ppjoke.model.Feed;
import com.mooc.ppjoke.view.PPImageView;

public abstract class LayoutFeedTypeCommentBinding extends ViewDataBinding {
  @NonNull
  public final PPImageView iconCover;

  @NonNull
  public final ImageView iconVideo;

  @NonNull
  public final LayoutProfileTabCommentInteractionBinding interactionBinding;

  @Bindable
  protected Feed mFeed;

  @Bindable
  protected LifecycleOwner mLifeCycleOwner;

  protected LayoutFeedTypeCommentBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, PPImageView iconCover, ImageView iconVideo,
      LayoutProfileTabCommentInteractionBinding interactionBinding) {
    super(_bindingComponent, _root, _localFieldCount);
    this.iconCover = iconCover;
    this.iconVideo = iconVideo;
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
  public static LayoutFeedTypeCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedTypeCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedTypeCommentBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_type_comment, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutFeedTypeCommentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedTypeCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedTypeCommentBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_type_comment, null, false, component);
  }

  public static LayoutFeedTypeCommentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutFeedTypeCommentBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutFeedTypeCommentBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_feed_type_comment);
  }
}
