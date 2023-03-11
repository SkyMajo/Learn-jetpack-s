package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mooc.ppjoke.model.Feed;
import com.mooc.ppjoke.view.FullScreenPlayerView;
import java.lang.Boolean;

public abstract class LayoutFeedDetailTypeVideoBinding extends ViewDataBinding {
  @NonNull
  public final ImageView actionClose;

  @NonNull
  public final LayoutFeedDetailAuthorInfoBinding authorInfo;

  @NonNull
  public final LayoutFeedDetailBottomInateractionBinding bottomInteraction;

  @NonNull
  public final CoordinatorLayout coordinator;

  @NonNull
  public final LayoutFeedDetailAuthorInfoBinding fullscreenAuthorInfo;

  @NonNull
  public final FullScreenPlayerView playerView;

  @NonNull
  public final RecyclerView recyclerView;

  @Bindable
  protected Feed mFeed;

  @Bindable
  protected Boolean mFullscreen;

  protected LayoutFeedDetailTypeVideoBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView actionClose, LayoutFeedDetailAuthorInfoBinding authorInfo,
      LayoutFeedDetailBottomInateractionBinding bottomInteraction, CoordinatorLayout coordinator,
      LayoutFeedDetailAuthorInfoBinding fullscreenAuthorInfo, FullScreenPlayerView playerView,
      RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actionClose = actionClose;
    this.authorInfo = authorInfo;
    setContainedBinding(this.authorInfo);;
    this.bottomInteraction = bottomInteraction;
    setContainedBinding(this.bottomInteraction);;
    this.coordinator = coordinator;
    this.fullscreenAuthorInfo = fullscreenAuthorInfo;
    setContainedBinding(this.fullscreenAuthorInfo);;
    this.playerView = playerView;
    this.recyclerView = recyclerView;
  }

  public abstract void setFeed(@Nullable Feed feed);

  @Nullable
  public Feed getFeed() {
    return mFeed;
  }

  public abstract void setFullscreen(@Nullable Boolean fullscreen);

  @Nullable
  public Boolean getFullscreen() {
    return mFullscreen;
  }

  @NonNull
  public static LayoutFeedDetailTypeVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedDetailTypeVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedDetailTypeVideoBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_detail_type_video, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutFeedDetailTypeVideoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedDetailTypeVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedDetailTypeVideoBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_detail_type_video, null, false, component);
  }

  public static LayoutFeedDetailTypeVideoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutFeedDetailTypeVideoBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutFeedDetailTypeVideoBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_feed_detail_type_video);
  }
}
