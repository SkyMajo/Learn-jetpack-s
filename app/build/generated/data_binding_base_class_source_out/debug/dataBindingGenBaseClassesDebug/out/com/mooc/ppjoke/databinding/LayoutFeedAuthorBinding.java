package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.mooc.ppjoke.model.User;
import com.mooc.ppjoke.view.PPImageView;

public abstract class LayoutFeedAuthorBinding extends ViewDataBinding {
  @NonNull
  public final TextView authorName;

  @NonNull
  public final PPImageView avatar;

  @NonNull
  public final TextView createTime;

  @NonNull
  public final ImageView feedDelete;

  @Bindable
  protected User mUser;

  protected LayoutFeedAuthorBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView authorName, PPImageView avatar, TextView createTime,
      ImageView feedDelete) {
    super(_bindingComponent, _root, _localFieldCount);
    this.authorName = authorName;
    this.avatar = avatar;
    this.createTime = createTime;
    this.feedDelete = feedDelete;
  }

  public abstract void setUser(@Nullable User user);

  @Nullable
  public User getUser() {
    return mUser;
  }

  @NonNull
  public static LayoutFeedAuthorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedAuthorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedAuthorBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_author, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutFeedAuthorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedAuthorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedAuthorBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_author, null, false, component);
  }

  public static LayoutFeedAuthorBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutFeedAuthorBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutFeedAuthorBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_feed_author);
  }
}
