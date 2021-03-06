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
 * Thrown when a requested format is not supported by an {@link AudioSource}
 * or {@link AudioSink} implementation
 * 
 * @author Harald Kuhn (hkuhn42) initial api
 */
public class UnsupportedAudioFormatException extends AudioException {

    private static final long serialVersionUID = 1L;

   /**
    * Unsupported {@link AudioFormat}
    */
    private AudioFormat unsupportedFormat;

   /**
    * Constructs a new exception with the specified detail message, unsupported format, and cause.
    *
    * @param message Detail message
    * @param unsupportedFormat Unsupported format
    * @param cause The cause 
    */
    public UnsupportedAudioFormatException(String message, AudioFormat unsupportedFormat, Throwable cause) {
        super(message, cause);
        this.unsupportedFormat = unsupportedFormat;
    }

   /**
    * Constructs a new exception with the specified detail message and unsupported format.
    *
    * @param message Detail message
    * @param unsupportedFormat Unsupported format
    */
    public UnsupportedAudioFormatException(String message, AudioFormat unsupportedFormat) {
        this(message, unsupportedFormat, null);
    }

   /**
    * Gets the unsupported format
    *
    * @return The unsupported format
    */
    public AudioFormat getUnsupportedFormat() {
        return unsupportedFormat;
    }
}
