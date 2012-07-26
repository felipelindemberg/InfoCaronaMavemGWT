package vai.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ExceptionSerialized_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, vai.client.ExceptionSerialized instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static vai.client.ExceptionSerialized instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new vai.client.ExceptionSerialized();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, vai.client.ExceptionSerialized instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return vai.client.ExceptionSerialized_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    vai.client.ExceptionSerialized_FieldSerializer.deserialize(reader, (vai.client.ExceptionSerialized)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    vai.client.ExceptionSerialized_FieldSerializer.serialize(writer, (vai.client.ExceptionSerialized)object);
  }
  
}
