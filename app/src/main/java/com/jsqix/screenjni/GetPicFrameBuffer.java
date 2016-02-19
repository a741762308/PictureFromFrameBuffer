package com.jsqix.screenjni;

public class GetPicFrameBuffer {
	static {
		System.loadLibrary("GetPicFrameBuffer");
	}

	public static native int getPicFromFrameBuffer(int width, int height, int bit);
}
