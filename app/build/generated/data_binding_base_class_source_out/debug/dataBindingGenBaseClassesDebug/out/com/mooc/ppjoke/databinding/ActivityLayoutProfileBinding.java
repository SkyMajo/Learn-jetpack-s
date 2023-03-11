package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.mooc.ppjoke.model.User;
import com.mooc.ppjoke.view.PPImageView;
import java.lang.Boolean;

public abstract class ActivityLayoutProfileBinding extends ViewDataBinding {
  @NonNull
  public final ImageView actionBack;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final PPImageView authorAvatarLarge;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final TextView fansCount;

  @NonNull
  public final TextView followCount;

  @NonNull
  public final TextView likeCount;

  @NonNull
  public final LinearLayout profileInfo;

  @NonNull
  public final TextView scoreCount;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final PPImageView topAuthorAvatar;

  @NonNull
  public final TextView topAuthorName;

  @NonNull
  public final TextView topAuthorNameLarge;

  @NonNull
  public final ConstraintLayout topUserInfo;

  @NonNull
  public final ViewPager2 viewPager;

  @Bindable
  protected User mUser;

  @Bindable
  protected Boolean mExpand;

  protected ActivityLayoutProfileBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView actionBack, AppBarLayout appbar,
      PPImageView authorAvatarLarge, CollapsingToolbarLayout collapsingToolbar, TextView fansCount,
      TextView followCount, TextView likeCount, LinearLayout profileInfo, TextView scoreCount,
      TabLayout tabLayout, PPImageView topAuthorAvatar, TextView topAuthorName,
      TextView topAuthorNameLarge, ConstraintLayout topUserInfo, ViewPager2 viewPager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actionBack = actionBack;
    this.appbar = appbar;
    this.authorAvatarLarge = authorAvatarLarge;
    this.collapsingToolbar = collapsingToolbar;
    this.fansCount = fansCount;
    this.followCount = followCount;
    this.likeCount = likeCount;
    this.profileInfo = profileInfo;
    this.scoreCount = scoreCount;
    this.tabLayout = tabLayout;
    this.topAuthorAvatar = topAuthorAvatar;
    this.topAuthorName = topAuthorName;
    this.topAuthorNameLarge = topAuthorNameLarge;
    this.topUserInfo = topUserInfo;
    this.viewPager = viewPager;
  }

  public abstract void setUser(@Nullable User user);

  @Nullable
  public User getUser() {
    return mUser;
  }

  public abstract void setExpand(@Nullable Boolean expand);

  @Nullable
  public Boolean getExpand() {
    return mExpand;
  }

  @NonNull
  public static ActivityLayoutProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLayoutProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLayoutProfileBinding>inflate(inflater, com.mooc.ppjoke.R.layout.activity_layout_profile, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLayoutProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLayoutProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLayoutProfileBinding>inflate(inflater, com.mooc.ppjoke.R.layout.activity_layout_profile, null, false, component);
  }

  public static ActivityLayoutProfileBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityLayoutProfileBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityLayoutProfileBinding)bind(component, view, com.mooc.ppjoke.R.layout.activity_layout_profile);
  }
}
