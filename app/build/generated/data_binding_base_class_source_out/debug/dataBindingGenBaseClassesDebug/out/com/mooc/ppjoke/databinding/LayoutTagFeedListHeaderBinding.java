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
import com.mooc.ppjoke.model.TagList;
import com.mooc.ppjoke.view.PPImageView;

public abstract class LayoutTagFeedListHeaderBinding extends ViewDataBinding {
  @NonNull
  public final PPImageView headerBackground;

  @NonNull
  public final TextView headerFollow;

  @NonNull
  public final TextView headerIntro;

  @NonNull
  public final TextView headerTagWatcher;

  @NonNull
  public final TextView headerTitle;

  @Bindable
  protected TagList mTagList;

  @Bindable
  protected LifecycleOwner mOwner;

  protected LayoutTagFeedListHeaderBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, PPImageView headerBackground, TextView headerFollow,
      TextView headerIntro, TextView headerTagWatcher, TextView headerTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.headerBackground = headerBackground;
    this.headerFollow = headerFollow;
    this.headerIntro = headerIntro;
    this.headerTagWatcher = headerTagWatcher;
    this.headerTitle = headerTitle;
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
  public static LayoutTagFeedListHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutTagFeedListHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutTagFeedListHeaderBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_tag_feed_list_header, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutTagFeedListHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutTagFeedListHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutTagFeedListHeaderBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_tag_feed_list_header, null, false, component);
  }

  public static LayoutTagFeedListHeaderBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutTagFeedListHeaderBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutTagFeedListHeaderBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_tag_feed_list_header);
  }
}
