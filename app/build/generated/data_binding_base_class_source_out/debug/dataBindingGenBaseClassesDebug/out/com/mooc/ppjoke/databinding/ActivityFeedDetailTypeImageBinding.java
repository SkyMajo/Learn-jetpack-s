package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mooc.ppjoke.model.Feed;

public abstract class ActivityFeedDetailTypeImageBinding extends ViewDataBinding {
  @NonNull
  public final ImageView actionClose;

  @NonNull
  public final LayoutFeedDetailAuthorInfoBinding authorInfoLayout;

  @NonNull
  public final LayoutFeedDetailBottomInateractionBinding interactionLayout;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextView title;

  @NonNull
  public final FrameLayout titleLayout;

  @Bindable
  protected Feed mFeed;

  protected ActivityFeedDetailTypeImageBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView actionClose,
      LayoutFeedDetailAuthorInfoBinding authorInfoLayout,
      LayoutFeedDetailBottomInateractionBinding interactionLayout, RecyclerView recyclerView,
      TextView title, FrameLayout titleLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actionClose = actionClose;
    this.authorInfoLayout = authorInfoLayout;
    setContainedBinding(this.authorInfoLayout);;
    this.interactionLayout = interactionLayout;
    setContainedBinding(this.interactionLayout);;
    this.recyclerView = recyclerView;
    this.title = title;
    this.titleLayout = titleLayout;
  }

  public abstract void setFeed(@Nullable Feed feed);

  @Nullable
  public Feed getFeed() {
    return mFeed;
  }

  @NonNull
  public static ActivityFeedDetailTypeImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityFeedDetailTypeImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityFeedDetailTypeImageBinding>inflate(inflater, com.mooc.ppjoke.R.layout.activity_feed_detail_type_image, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityFeedDetailTypeImageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityFeedDetailTypeImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityFeedDetailTypeImageBinding>inflate(inflater, com.mooc.ppjoke.R.layout.activity_feed_detail_type_image, null, false, component);
  }

  public static ActivityFeedDetailTypeImageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityFeedDetailTypeImageBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityFeedDetailTypeImageBinding)bind(component, view, com.mooc.ppjoke.R.layout.activity_feed_detail_type_image);
  }
}
