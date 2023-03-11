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
import com.google.android.material.button.MaterialButton;
import com.mooc.ppjoke.model.TagList;
import com.mooc.ppjoke.view.PPImageView;

public abstract class LayoutTagListItemBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton actionFollow;

  @NonNull
  public final PPImageView tagAvtar;

  @NonNull
  public final TextView tagDesc;

  @NonNull
  public final TextView tagTitle;

  @Bindable
  protected TagList mTagList;

  protected LayoutTagListItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, MaterialButton actionFollow, PPImageView tagAvtar, TextView tagDesc,
      TextView tagTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actionFollow = actionFollow;
    this.tagAvtar = tagAvtar;
    this.tagDesc = tagDesc;
    this.tagTitle = tagTitle;
  }

  public abstract void setTagList(@Nullable TagList tagList);

  @Nullable
  public TagList getTagList() {
    return mTagList;
  }

  @NonNull
  public static LayoutTagListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutTagListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutTagListItemBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_tag_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutTagListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutTagListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutTagListItemBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_tag_list_item, null, false, component);
  }

  public static LayoutTagListItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutTagListItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutTagListItemBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_tag_list_item);
  }
}
