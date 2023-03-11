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
import java.lang.Integer;
import java.lang.String;

public abstract class LayoutFeedTextBinding extends ViewDataBinding {
  @Bindable
  protected String mFeedText;

  @Bindable
  protected Integer mLines;

  protected LayoutFeedTextBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setFeedText(@Nullable String feedText);

  @Nullable
  public String getFeedText() {
    return mFeedText;
  }

  public abstract void setLines(@Nullable Integer lines);

  @Nullable
  public Integer getLines() {
    return mLines;
  }

  @NonNull
  public static LayoutFeedTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedTextBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_text, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutFeedTextBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedTextBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_text, null, false, component);
  }

  public static LayoutFeedTextBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutFeedTextBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutFeedTextBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_feed_text);
  }
}
