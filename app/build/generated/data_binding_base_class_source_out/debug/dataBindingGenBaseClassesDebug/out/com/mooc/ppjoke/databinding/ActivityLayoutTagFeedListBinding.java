package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.button.MaterialButton;
import com.mooc.ppjoke.model.TagList;
import com.mooc.ppjoke.view.PPImageView;

public abstract class ActivityLayoutTagFeedListBinding extends ViewDataBinding {
  @NonNull
  public final ImageView actionBack;

  @NonNull
  public final LayoutRefreshViewBinding refreshLayout;

  @NonNull
  public final PPImageView tagLogo;

  @NonNull
  public final TextView tagTitle;

  @NonNull
  public final ConstraintLayout topBar;

  @NonNull
  public final MaterialButton topBarFollow;

  @NonNull
  public final View topLine;

  @Bindable
  protected TagList mTagList;

  @Bindable
  protected LifecycleOwner mOwner;

  protected ActivityLayoutTagFeedListBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView actionBack, LayoutRefreshViewBinding refreshLayout,
      PPImageView tagLogo, TextView tagTitle, ConstraintLayout topBar, MaterialButton topBarFollow,
      View topLine) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actionBack = actionBack;
    this.refreshLayout = refreshLayout;
    setContainedBinding(this.refreshLayout);;
    this.tagLogo = tagLogo;
    this.tagTitle = tagTitle;
    this.topBar = topBar;
    this.topBarFollow = topBarFollow;
    this.topLine = topLine;
  }

  public abstract void setTagList(@Nullable TagList tagList);

  @Nullable
  public TagList getTagList() {
    return mTagList;
  }

  public abstract void setOwner(@Nullable LifecycleOwner owner);

  @Nullable
  public LifecycleOwner getOwner() {
    return mOwner;
  }

  @NonNull
  public static ActivityLayoutTagFeedListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLayoutTagFeedListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLayoutTagFeedListBinding>inflate(inflater, com.mooc.ppjoke.R.layout.activity_layout_tag_feed_list, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLayoutTagFeedListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLayoutTagFeedListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLayoutTagFeedListBinding>inflate(inflater, com.mooc.ppjoke.R.layout.activity_layout_tag_feed_list, null, false, component);
  }

  public static ActivityLayoutTagFeedListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityLayoutTagFeedListBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityLayoutTagFeedListBinding)bind(component, view, com.mooc.ppjoke.R.layout.activity_layout_tag_feed_list);
  }
}
