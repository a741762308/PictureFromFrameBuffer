# PictureFromFrameBuffer
=====

1. 手机必须root

2. 调用截图

  2.1 命令行
  
      ScreentShotUtil.getInstance().takeScreenshot(this, "/sdcard/aa.png");
    
  2.2 framebuffer
  
      GetPicFrameBuffer.getPicFromFrameBuffer(width,height,bit);
