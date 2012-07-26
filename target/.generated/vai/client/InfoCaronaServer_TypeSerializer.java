package vai.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class InfoCaronaServer_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, String> methodMapJava;
  private static final Map<String, String> signatureMapJava;
  
  static {
    methodMapJava = loadMethodsJava();
    signatureMapJava = loadSignaturesJava();
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadMethodsJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException/2345075298", "com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.XsrfToken/4254043109", "com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.ChangeListenerCollection/287642957", "com.google.gwt.user.client.ui.ChangeListenerCollection_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.ClickListenerCollection/2152455986", "com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.FocusListenerCollection/119490835", "com.google.gwt.user.client.ui.FocusListenerCollection_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.KeyboardListenerCollection/1040442242", "com.google.gwt.user.client.ui.KeyboardListenerCollection_FieldSerializer");
    result.put("java.lang.String/2004016611", "com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer");
    result.put("[Ljava.lang.String;/2600011424", "com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer");
    result.put("[Ljava.util.AbstractList;/727920111", "com.google.gwt.user.client.rpc.core.java.util.AbstractList_Array_Rank_1_FieldSerializer");
    result.put("[Ljava.util.AbstractSequentialList;/3144020509", "com.google.gwt.user.client.rpc.core.java.util.AbstractSequentialList_Array_Rank_1_FieldSerializer");
    result.put("java.util.ArrayList/4159755760", "com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer");
    result.put("[Ljava.util.ArrayList;/2683379088", "com.google.gwt.user.client.rpc.core.java.util.ArrayList_Array_Rank_1_FieldSerializer");
    result.put("java.util.Arrays$ArrayList/2507071751", "com.google.gwt.user.client.rpc.core.java.util.Arrays_ArrayList_FieldSerializer");
    result.put("java.util.Collections$EmptyList/4157118744", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyList_FieldSerializer");
    result.put("java.util.Collections$SingletonList/1586180994", "com.google.gwt.user.client.rpc.core.java.util.Collections_SingletonList_FieldSerializer");
    result.put("java.util.LinkedList/3953877921", "com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer");
    result.put("[Ljava.util.LinkedList;/1037437294", "com.google.gwt.user.client.rpc.core.java.util.LinkedList_Array_Rank_1_FieldSerializer");
    result.put("[Ljava.util.List;/2827171268", "com.google.gwt.user.client.rpc.core.java.util.List_Array_Rank_1_FieldSerializer");
    result.put("java.util.Stack/1346942793", "com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer");
    result.put("[Ljava.util.Stack;/675459124", "com.google.gwt.user.client.rpc.core.java.util.Stack_Array_Rank_1_FieldSerializer");
    result.put("java.util.Vector/3057315478", "com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer");
    result.put("[Ljava.util.Vector;/3889776585", "com.google.gwt.user.client.rpc.core.java.util.Vector_Array_Rank_1_FieldSerializer");
    result.put("vai.client.ExceptionSerialized/549816544", "vai.client.ExceptionSerialized_FieldSerializer");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadSignaturesJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException", "com.google.gwt.user.client.rpc.RpcTokenException/2345075298");
    result.put("com.google.gwt.user.client.rpc.XsrfToken", "com.google.gwt.user.client.rpc.XsrfToken/4254043109");
    result.put("com.google.gwt.user.client.ui.ChangeListenerCollection", "com.google.gwt.user.client.ui.ChangeListenerCollection/287642957");
    result.put("com.google.gwt.user.client.ui.ClickListenerCollection", "com.google.gwt.user.client.ui.ClickListenerCollection/2152455986");
    result.put("com.google.gwt.user.client.ui.FocusListenerCollection", "com.google.gwt.user.client.ui.FocusListenerCollection/119490835");
    result.put("com.google.gwt.user.client.ui.KeyboardListenerCollection", "com.google.gwt.user.client.ui.KeyboardListenerCollection/1040442242");
    result.put("java.lang.String", "java.lang.String/2004016611");
    result.put("[Ljava.lang.String;", "[Ljava.lang.String;/2600011424");
    result.put("[Ljava.util.AbstractList;", "[Ljava.util.AbstractList;/727920111");
    result.put("[Ljava.util.AbstractSequentialList;", "[Ljava.util.AbstractSequentialList;/3144020509");
    result.put("java.util.ArrayList", "java.util.ArrayList/4159755760");
    result.put("[Ljava.util.ArrayList;", "[Ljava.util.ArrayList;/2683379088");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer.concreteType(), "java.util.Arrays$ArrayList/2507071751");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyList/4157118744");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer.concreteType(), "java.util.Collections$SingletonList/1586180994");
    result.put("java.util.LinkedList", "java.util.LinkedList/3953877921");
    result.put("[Ljava.util.LinkedList;", "[Ljava.util.LinkedList;/1037437294");
    result.put("[Ljava.util.List;", "[Ljava.util.List;/2827171268");
    result.put("java.util.Stack", "java.util.Stack/1346942793");
    result.put("[Ljava.util.Stack;", "[Ljava.util.Stack;/675459124");
    result.put("java.util.Vector", "java.util.Vector/3057315478");
    result.put("[Ljava.util.Vector;", "[Ljava.util.Vector;/3889776585");
    result.put("vai.client.ExceptionSerialized", "vai.client.ExceptionSerialized/549816544");
    return result;
  }
  
  public InfoCaronaServer_TypeSerializer() {
    super(methodMapJava, null, signatureMapJava, null);
  }
  
}
