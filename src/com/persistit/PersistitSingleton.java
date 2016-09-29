package com.persistit;

import com.persistit.Persistit;
import com.persistit.exception.PersistitException;

public class PersistitSingleton {

  private PersistitSingleton() {}

  private static class PersistitSingletonHolder {
    private static final Persistit INSTANCE = new Persistit();
  }

  public static Persistit getInstance() throws PersistitException {
    Persistit INSTANCE = PersistitSingletonHolder.INSTANCE;
    if (!INSTANCE.isInitialized()) {
      INSTANCE.initialize();
    }
    return PersistitSingletonHolder.INSTANCE;
  }

}
