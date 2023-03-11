package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.mooc.ppjoke.model.Feed;
import com.mooc.ppjoke.view.PPImageView;
import java.lang.Boolean;
import java.lang.Integer;

public abstract class LayoutFeedDetailAuthorInfoBinding extends ViewDataBinding {
  @NonNull
  public final PPImageView authorAvatar;

  @NonNull
  public final ConstraintLayout authorInfo;

  @NonNull
  public final TextView authorName;

  @NonNull
  public final TextView createTime;

  @Bindable
  protected Feed mFeed;

  @Bindable
  protected Integer mLeftMargin;

  @Bindable
  protected Boolean mFullscreen;

  @Bindable
  protected LifecycleOwner mOwner;

  protected LayoutFeedDetailAuthorInfoBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, PPImageView authorAvatar, ConstraintLayout authorInfo,
      TextView authorName, TextView createTime) {
    super(_bindingComponent, _root, _localFieldCount);
    this.authorAvatar = authorAvatar;
    this.authorInfo = authorInfo;
    this.authorName = authorName;
    this.createTime = createTime;
  }

  public abstract void setFeed(@Nullable Feed feed);

  @Nullable
  public Feed getFeed() {
    return mFeed;
  }

  public abstract void setLeftMargin(@Nullable Integer leftMargin);

  @Nullable
  public Integer getLeftMargin() {
    return mLeftMargin;
  }

  public abstract void setFullscreen(@Nullable Boolean fullscreen);

  @Nullable
  public Boolean getFullscreen() {
    return mFullscreen;
  }

  public abstract void setOwner(@Nullable LifecycleOwner owner);

  @Nullable
  public LifecycleOwner getOwner() {
    return mOwner;
  }

  @NonNull
  public static LayoutFeedDetailAuthorInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedDetailAuthorInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedDetailAuthorInfoBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_detail_author_info, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutFeedDetailAuthorInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedDetailAuthorInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedDetailAuthorInfoBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_detail_author_info, null, false, component);
  }

  public static LayoutFeedDetailAuthorInfoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutFeedDetailAuthorInfoBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutFeedDetailAuthorInfoBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_feed_detail_author_info);
  }
}
