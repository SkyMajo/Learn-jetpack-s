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
import com.google.android.material.button.MaterialButton;
import com.mooc.ppjoke.model.Feed;

public abstract class LayoutProfileTabCommentInteractionBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton comment;

  @NonNull
  public final MaterialButton like;

  @NonNull
  public final MaterialButton share;

  @Bindable
  protected Feed mFeed;

  @Bindable
  protected LifecycleOwner mLifeCycleOwner;

  protected LayoutProfileTabCommentInteractionBinding(DataBindingComponent _bindingComponent,
      View _root, int _localFieldCount, MaterialButton comment, MaterialButton like,
      MaterialButton share) {
    super(_bindingComponent, _root, _localFieldCount);
    this.comment = comment;
    this.like = like;
    this.share = share;
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
  public static LayoutProfileTabCommentInteractionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutProfileTabCommentInteractionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutProfileTabCommentInteractionBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_profile_tab_comment_interaction, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutProfileTabCommentInteractionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutProfileTabCommentInteractionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutProfileTabCommentInteractionBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_profile_tab_comment_interaction, null, false, component);
  }

  public static LayoutProfileTabCommentInteractionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutProfileTabCommentInteractionBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutProfileTabCommentInteractionBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_profile_tab_comment_interaction);
  }
}
