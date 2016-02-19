LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_LDLIBS += -L$(SYSROOT)/usr/lib -llog
LOCAL_MODULE    := GetPicUsingJni
LOCAL_SRC_FILES := com_getpic_GetPicUsingJni.c

include $(BUILD_SHARED_LIBRARY)

