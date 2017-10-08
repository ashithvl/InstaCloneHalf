package com.blueangles.instaclonehalf.model;

import android.net.Uri;

/**
 * Created by Ashith VL on 10/8/2017.
 */

public class InstaImage {
    private Uri imageUri;

    public InstaImage(Uri imageUri) {
        this.imageUri = imageUri;
    }

    public Uri getImageUri() {
        return imageUri;
    }
}
