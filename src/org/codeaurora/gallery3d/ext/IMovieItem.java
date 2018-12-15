package org.codeaurora.gallery3d.ext;

import android.net.Uri;

/**
 * Movie info class
 */
public interface IMovieItem {
    /**
     * @return movie Uri, it's may be not the original Uri.
     */
    Uri getUri();

    /**
     * set video Uri
     *
     * @param uri
     */
    void setUri(Uri uri);

    /**
     * @return MIME type of video
     */
    String getMimeType();

    /**
     * Set MIME type of video
     *
     * @param mimeType
     */
    void setMimeType(String mimeType);

    /**
     * @return title of video
     */
    String getTitle();

    /**
     * set title of video
     *
     * @param title
     */
    void setTitle(String title);

    /**
     * @return whether error occured or not.
     */
    boolean getError();

    /**
     * Set error occured flag
     */
    void setError();

    /**
     * @return return original Uri of video.
     */
    Uri getOriginalUri();

    /**
     * Set video original Uri.
     *
     * @param uri
     */
    void setOriginalUri(Uri uri);
}
