package com.paulds.simpleftp.presentation.binders;

import androidx.databinding.BindingAdapter;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/**
 * Class used to defined binding for a swipe refresh layout.
 *
 * @author Paul-DS
 */
public class RefreshBinding {

    /**
     * Sets the refresh listener.
     * @param view The current swipe refresh layout.
     * @param listener The listener which will call for refresh.
     */
    @BindingAdapter("onRefresh")
    public static void setListener(SwipeRefreshLayout view, SwipeRefreshLayout.OnRefreshListener listener) {
        view.setOnRefreshListener(listener);
    }

    /**
     * Sets the new refresh state.
     * @param view The current swipe refresh layout.
     * @param value The value indicating whether the refresh animation should be activated.
     */
    @BindingAdapter("isRefreshing")
    public static void setIsRefreshing(SwipeRefreshLayout view, boolean value) {
        view.setRefreshing(value);
    }
}
