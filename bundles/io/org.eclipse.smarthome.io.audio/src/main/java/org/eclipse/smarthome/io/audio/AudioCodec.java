/**
 * Copyright (c) 2015-2016 Harald Kuhn
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.io.audio;

/**
 * An collection of constatns for commonly used audio codecs
 *
 * @author Harald Kuhn (hkuhn42) initial api
 *
 */
public class AudioCodec {

    /**
     * PCM Signed
     * 
     * http://wiki.multimedia.cx/?title=PCM#PCM_Types
     */
    public static final String PCM_SIGNED = "PCM_SIGNED";

    /**
     * PCM Unsigned
     * 
     * http://wiki.multimedia.cx/?title=PCM#PCM_Types
     */
    public static final String PCM_UNSIGNED = "PCM_UNSIGNED";

    /**
     * MP3 Codec
     */
    public static final String MP3 = "MP3";

    /**
     * Vorbis Codec
     */
    public static final String VORBIS = "VORBIS";
}
