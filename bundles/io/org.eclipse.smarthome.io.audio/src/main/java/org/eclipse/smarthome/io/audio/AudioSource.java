/**
 * Copyright (c) 2015-2016 Harald Kuhn
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.io.audio;

import java.io.InputStream;
import java.util.Set;

/**
 * Wrapper for a source of audio data
 *
 *  @author Harald Kuhn (hkuhn42) initial api
 */
public interface AudioSource {
    /**
     * Gets the supported audio format
     *
     * @return The supported audio format
     */
    public AudioFormat getFormat();

    /**
     * Gets InputStream to reading audio data in supported audio format
     *
     * @return InputStream for reading audio data
     * @throws AudioException If problem occurs obtaining InputStream
     */
    public InputStream getInputStream() throws AudioException;

}
