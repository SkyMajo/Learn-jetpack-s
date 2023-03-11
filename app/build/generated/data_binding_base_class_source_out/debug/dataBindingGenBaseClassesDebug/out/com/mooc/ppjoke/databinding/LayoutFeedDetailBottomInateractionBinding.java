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
import androidx.lifecycle.LifecycleOwner;
import com.mooc.ppjoke.model.Feed;
import java.lang.Boolean;

public abstract class LayoutFeedDetailBottomInateractionBinding extends ViewDataBinding {
  @NonNull
  public final TextView inputView;

  @Bindable
  protected Feed mFeed;

  @Bindable
  protected Boolean mFullscreen;

  @Bindable
  protected LifecycleOwner mOwner;

  protected LayoutFeedDetailBottomInateractionBinding(DataBindingComponent _bindingComponent,
      View _root, int _localFieldCount, TextView inputView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.inputView = inputView;
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

  public abstract void setOwner(@Nullable LifecycleOwner owner);

  @Nullable
  public LifecycleOwner getOwner() {
    return mOwner;
  }

  @NonNull
  public static LayoutFeedDetailBottomInateractionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedDetailBottomInateractionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedDetailBottomInateractionBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_detail_bottom_inateraction, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutFeedDetailBottomInateractionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedDetailBottomInateractionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedDetailBottomInateractionBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_detail_bottom_inateraction, null, false, component);
  }

  public static LayoutFeedDetailBottomInateractionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutFeedDetailBottomInateractionBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutFeedDetailBottomInateractionBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_feed_detail_bottom_inateraction);
  }
}
