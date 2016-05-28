package io.burt.jmespath;

import java.util.List;
import java.util.Comparator;
import java.util.Map;

public interface Adapter<T> extends Comparator<T> {
  T parseString(String str);

  List<T> toList(T array);

  boolean isArray(T value);

  boolean isObject(T value);

  boolean isNumber(T value);

  boolean isTruthy(T value);

  T getProperty(T value, String name);

  T createNull();

  T createArray(List<T> elements);

  T createArray(List<T> elements, boolean compact);

  T createString(String str);

  T createBoolean(boolean b);

  T createObject(Map<String, T> obj);
}
