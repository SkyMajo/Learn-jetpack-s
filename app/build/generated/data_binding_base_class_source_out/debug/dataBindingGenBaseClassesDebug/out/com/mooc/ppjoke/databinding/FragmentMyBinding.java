package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.mooc.ppjoke.model.User;
import com.mooc.ppjoke.view.PPImageView;

public abstract class FragmentMyBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView actionLogout;

  @NonNull
  public final PPImageView avatar;

  @NonNull
  public final CardView cardOverlap;

  @NonNull
  public final TextView description;

  @NonNull
  public final TextView fansCount;

  @NonNull
  public final TextView followCount;

  @NonNull
  public final AppCompatImageView goDetail;

  @NonNull
  public final TextView likeCount;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView scoreCount;

  @NonNull
  public final TextView userComment;

  @NonNull
  public final TextView userFavorite;

  @NonNull
  public final TextView userFeed;

  @NonNull
  public final TextView userHistory;

  @Bindable
  protected User mUser;

  protected FragmentMyBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppCompatImageView actionLogout, PPImageView avatar,
      CardView cardOverlap, TextView description, TextView fansCount, TextView followCount,
      AppCompatImageView goDetail, TextView likeCount, TextView name, TextView scoreCount,
      TextView userComment, TextView userFavorite, TextView userFeed, TextView userHistory) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actionLogout = actionLogout;
    this.avatar = avatar;
    this.cardOverlap = cardOverlap;
    this.description = description;
    this.fansCount = fansCount;
    this.followCount = followCount;
    this.goDetail = goDetail;
    this.likeCount = likeCount;
    this.name = name;
    this.scoreCount = scoreCount;
    this.userComment = userComment;
    this.userFavorite = userFavorite;
    this.userFeed = userFeed;
    this.userHistory = userHistory;
  }

  public abstract void setUser(@Nullable User user);

  @Nullable
  public User getUser() {
    return mUser;
  }

  @NonNull
  public static FragmentMyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentMyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentMyBinding>inflate(inflater, com.mooc.ppjoke.R.layout.fragment_my, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentMyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentMyBinding>inflate(inflater, com.mooc.ppjoke.R.layout.fragment_my, null, false, component);
  }

  public static FragmentMyBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentMyBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentMyBinding)bind(component, view, com.mooc.ppjoke.R.layout.fragment_my);
  }
}
