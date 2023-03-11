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
import java.lang.String;

public abstract class LayoutFeedTagBinding extends ViewDataBinding {
  @Bindable
  protected String mTagText;

  protected LayoutFeedTagBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setTagText(@Nullable String tagText);

  @Nullable
  public String getTagText() {
    return mTagText;
  }

  @NonNull
  public static LayoutFeedTagBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedTagBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedTagBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_tag, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutFeedTagBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedTagBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedTagBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_tag, null, false, component);
  }

  public static LayoutFeedTagBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutFeedTagBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutFeedTagBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_feed_tag);
  }
}
