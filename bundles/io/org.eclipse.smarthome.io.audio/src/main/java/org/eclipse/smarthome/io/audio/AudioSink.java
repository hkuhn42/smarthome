/**
 * Copyright (c) 2015-2016 Harald Kuhn
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.io.audio;

import java.util.Set;

/**
 * Definition of an audio output like headphones, a speaker or for writing to
 * a file / clip. Also used by TTS service.
 *
 * @author Harald Kuhn (hkuhn42) initial api
 */
public interface AudioSink {
   /**
    * Processes the passed {@link AudioSource}
    *
    * If the passed {@link AudioSource} has a {@link AudioFormat} not supported by this instance,
    * an {@link UnsupportedAudioFormatException} is thrown.
    *
    * @return A boolean indicating processing started
    * @throws UnsupportedAudioFormatException If audioSource format is not supported
    */
    boolean process(AudioSource audioSource) throws UnsupportedAudioFormatException;

    /**
     * Gets a set containing all supported audio formats
     *
     * @return A Set containing all supported audio formats
     */
    public Set<AudioFormat> getSupportedFormats();
}
