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
 * An audio format definition 
 *
 * @author Harald Kuhn (hkuhn42) initial api
 */
public class AudioFormat {

    /**
     * Codec
     */
    private String codec;

    /**
     * Container
     */
    private String container;

    /**
     * Big endian or little endian
     */
    private boolean bigEndian;

    /**
     * Bit depth or bit rate depending on codec
     *
     * @see <a href="http://bit.ly/1OTydad">Bit Depth</a>
     * @see <a href="http://bit.ly/1OTy5rk">Bit Rate</a>
     */
    private int bits;

    /**
     * Sample frequency
     */
    private long frequency;

    /**
     * Gets codec
     *
     * @return The codec
     */
    public String getCodec() {
        return codec;
    }

    /**
     * Sets codec
     *
     * @param codec The codec
     */
    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * Gets container
     *
     * @return The container
     */
    public String getContainer() {
        return container;
    }

    /**
     * Sets container
     *
     * @param container The container
     */
    public void setContainer(String container) {
        this.container = container;
    }

    /**
     * Is big endian?
     *
     * @return If format is big endian 
     */
    public boolean isBigEndian() {
        return bigEndian;
    }

    /**
     * Sets big endian
     *
     * @param bigEndian Sets if is big endian
     */
    public void setBigEndian(boolean bigEndian) {
        this.bigEndian = bigEndian;
    }

    /**
     * Gets bit depth or bit rate depending on codec.
     *
     * @see <a href="http://bit.ly/1OTydad">Bit Depth</a>
     * @see <a href="http://bit.ly/1OTy5rk">Bit Rate</a>
     * @return Bit depth or bit rate depending on codec
     */
    public int getBits() {
        return bits;
    }

    /**
     * Sets bit depth or bit rate depending on codec.
     *
     * @see <a href="http://bit.ly/1OTydad">Bit Depth</a>
     * @see <a href="http://bit.ly/1OTy5rk">Bit Rate</a>
     * @param bits Bit depth or bit rate depending on codec
     */
    public void setBits(int bits) {
        this.bits = bits;
    }

    /**
     * Gets frequency
     *
     * @return The frequency
     */
    public long getFrequency() {
        return frequency;
    }

    /**
     * Sets frequency
     *
     * @param frequency The frequency
     */
    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AudioFormat) {
            AudioFormat format = (AudioFormat) obj;
            if (format.getCodec() != getCodec()) {
                return false;
            }
            if (format.getContainer() != getContainer()) {
                return false;
            }
            if (format.isBigEndian() != isBigEndian()) {
                return false;
            }
            if (format.getBits() != getBits()) {
                return false;
            }
            if (format.getFrequency() != getFrequency()) {
                return false;
            }
            return true;
        }
        return super.equals(obj);
    }
}
