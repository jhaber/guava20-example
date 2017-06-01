package example;

import java.util.concurrent.ExecutorService;

import com.google.common.util.concurrent.ForwardingExecutorService;

public class MyExecutorService extends ForwardingExecutorService {

  protected ExecutorService delegate() {
    return null;
  }
}
