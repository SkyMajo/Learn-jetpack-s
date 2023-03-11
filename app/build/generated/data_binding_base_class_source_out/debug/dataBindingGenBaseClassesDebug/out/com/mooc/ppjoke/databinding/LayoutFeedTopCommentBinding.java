package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.mooc.ppjoke.model.Comment;
import com.mooc.ppjoke.view.PPImageView;

public abstract class LayoutFeedTopCommentBinding extends ViewDataBinding {
  @NonNull
  public final PPImageView avatar;

  @NonNull
  public final TextView userName;

  @Bindable
  protected Comment mComment;

  @Bindable
  protected LifecycleOwner mLifeCycleOwner;

  protected LayoutFeedTopCommentBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, PPImageView avatar, TextView userName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.avatar = avatar;
    this.userName = userName;
  }

  public abstract void setComment(@Nullable Comment comment);

  @Nullable
  public Comment getComment() {
    return mComment;
  }

  public abstract void setLifeCycleOwner(@Nullable LifecycleOwner lifeCycleOwner);

  @Nullable
  public LifecycleOwner getLifeCycleOwner() {
    return mLifeCycleOwner;
  }

  @NonNull
  public static LayoutFeedTopCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedTopCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedTopCommentBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_top_comment, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutFeedTopCommentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedTopCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedTopCommentBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_top_comment, null, false, component);
  }

  public static LayoutFeedTopCommentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutFeedTopCommentBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutFeedTopCommentBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_feed_top_comment);
  }
}
