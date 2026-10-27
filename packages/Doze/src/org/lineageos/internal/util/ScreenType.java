//
// Copyright (C) 2026 The LineageOS Project
//
// SPDX-License-Identifier: Apache-2.0
//

package org.lineageos.internal.util;

import android.content.Context;
import android.content.res.Configuration;

/**
 * Stub of the LineageOS platform library class, which the A17 base
 * (PixelOS) no longer ships.
 */
public class ScreenType {
    public static boolean isTablet(Context context) {
        return (context.getResources().getConfiguration().screenLayout
                & Configuration.SCREENLAYOUT_SIZE_MASK)
                >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }
}
