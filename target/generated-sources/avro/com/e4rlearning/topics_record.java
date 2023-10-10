/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.e4rlearning;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class topics_record extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4164474138897795868L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"topics_record\",\"namespace\":\"com.e4rlearning\",\"fields\":[{\"name\":\"topic\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"tno\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"topicdesc\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<topics_record> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<topics_record> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<topics_record> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<topics_record> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<topics_record> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this topics_record to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a topics_record from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a topics_record instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static topics_record fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String topic;
  private java.lang.String tno;
  private java.lang.String topicdesc;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public topics_record() {}

  /**
   * All-args constructor.
   * @param topic The new value for topic
   * @param tno The new value for tno
   * @param topicdesc The new value for topicdesc
   */
  public topics_record(java.lang.String topic, java.lang.String tno, java.lang.String topicdesc) {
    this.topic = topic;
    this.tno = tno;
    this.topicdesc = topicdesc;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return topic;
    case 1: return tno;
    case 2: return topicdesc;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: topic = value$ != null ? value$.toString() : null; break;
    case 1: tno = value$ != null ? value$.toString() : null; break;
    case 2: topicdesc = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'topic' field.
   * @return The value of the 'topic' field.
   */
  public java.lang.String getTopic() {
    return topic;
  }


  /**
   * Sets the value of the 'topic' field.
   * @param value the value to set.
   */
  public void setTopic(java.lang.String value) {
    this.topic = value;
  }

  /**
   * Gets the value of the 'tno' field.
   * @return The value of the 'tno' field.
   */
  public java.lang.String getTno() {
    return tno;
  }


  /**
   * Sets the value of the 'tno' field.
   * @param value the value to set.
   */
  public void setTno(java.lang.String value) {
    this.tno = value;
  }

  /**
   * Gets the value of the 'topicdesc' field.
   * @return The value of the 'topicdesc' field.
   */
  public java.lang.String getTopicdesc() {
    return topicdesc;
  }


  /**
   * Sets the value of the 'topicdesc' field.
   * @param value the value to set.
   */
  public void setTopicdesc(java.lang.String value) {
    this.topicdesc = value;
  }

  /**
   * Creates a new topics_record RecordBuilder.
   * @return A new topics_record RecordBuilder
   */
  public static com.e4rlearning.topics_record.Builder newBuilder() {
    return new com.e4rlearning.topics_record.Builder();
  }

  /**
   * Creates a new topics_record RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new topics_record RecordBuilder
   */
  public static com.e4rlearning.topics_record.Builder newBuilder(com.e4rlearning.topics_record.Builder other) {
    if (other == null) {
      return new com.e4rlearning.topics_record.Builder();
    } else {
      return new com.e4rlearning.topics_record.Builder(other);
    }
  }

  /**
   * Creates a new topics_record RecordBuilder by copying an existing topics_record instance.
   * @param other The existing instance to copy.
   * @return A new topics_record RecordBuilder
   */
  public static com.e4rlearning.topics_record.Builder newBuilder(com.e4rlearning.topics_record other) {
    if (other == null) {
      return new com.e4rlearning.topics_record.Builder();
    } else {
      return new com.e4rlearning.topics_record.Builder(other);
    }
  }

  /**
   * RecordBuilder for topics_record instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<topics_record>
    implements org.apache.avro.data.RecordBuilder<topics_record> {

    private java.lang.String topic;
    private java.lang.String tno;
    private java.lang.String topicdesc;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.e4rlearning.topics_record.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.topic)) {
        this.topic = data().deepCopy(fields()[0].schema(), other.topic);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.tno)) {
        this.tno = data().deepCopy(fields()[1].schema(), other.tno);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.topicdesc)) {
        this.topicdesc = data().deepCopy(fields()[2].schema(), other.topicdesc);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing topics_record instance
     * @param other The existing instance to copy.
     */
    private Builder(com.e4rlearning.topics_record other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.topic)) {
        this.topic = data().deepCopy(fields()[0].schema(), other.topic);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.tno)) {
        this.tno = data().deepCopy(fields()[1].schema(), other.tno);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.topicdesc)) {
        this.topicdesc = data().deepCopy(fields()[2].schema(), other.topicdesc);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'topic' field.
      * @return The value.
      */
    public java.lang.String getTopic() {
      return topic;
    }


    /**
      * Sets the value of the 'topic' field.
      * @param value The value of 'topic'.
      * @return This builder.
      */
    public com.e4rlearning.topics_record.Builder setTopic(java.lang.String value) {
      validate(fields()[0], value);
      this.topic = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'topic' field has been set.
      * @return True if the 'topic' field has been set, false otherwise.
      */
    public boolean hasTopic() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'topic' field.
      * @return This builder.
      */
    public com.e4rlearning.topics_record.Builder clearTopic() {
      topic = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'tno' field.
      * @return The value.
      */
    public java.lang.String getTno() {
      return tno;
    }


    /**
      * Sets the value of the 'tno' field.
      * @param value The value of 'tno'.
      * @return This builder.
      */
    public com.e4rlearning.topics_record.Builder setTno(java.lang.String value) {
      validate(fields()[1], value);
      this.tno = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'tno' field has been set.
      * @return True if the 'tno' field has been set, false otherwise.
      */
    public boolean hasTno() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'tno' field.
      * @return This builder.
      */
    public com.e4rlearning.topics_record.Builder clearTno() {
      tno = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'topicdesc' field.
      * @return The value.
      */
    public java.lang.String getTopicdesc() {
      return topicdesc;
    }


    /**
      * Sets the value of the 'topicdesc' field.
      * @param value The value of 'topicdesc'.
      * @return This builder.
      */
    public com.e4rlearning.topics_record.Builder setTopicdesc(java.lang.String value) {
      validate(fields()[2], value);
      this.topicdesc = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'topicdesc' field has been set.
      * @return True if the 'topicdesc' field has been set, false otherwise.
      */
    public boolean hasTopicdesc() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'topicdesc' field.
      * @return This builder.
      */
    public com.e4rlearning.topics_record.Builder clearTopicdesc() {
      topicdesc = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public topics_record build() {
      try {
        topics_record record = new topics_record();
        record.topic = fieldSetFlags()[0] ? this.topic : (java.lang.String) defaultValue(fields()[0]);
        record.tno = fieldSetFlags()[1] ? this.tno : (java.lang.String) defaultValue(fields()[1]);
        record.topicdesc = fieldSetFlags()[2] ? this.topicdesc : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<topics_record>
    WRITER$ = (org.apache.avro.io.DatumWriter<topics_record>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<topics_record>
    READER$ = (org.apache.avro.io.DatumReader<topics_record>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.topic);

    out.writeString(this.tno);

    out.writeString(this.topicdesc);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.topic = in.readString();

      this.tno = in.readString();

      this.topicdesc = in.readString();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.topic = in.readString();
          break;

        case 1:
          this.tno = in.readString();
          break;

        case 2:
          this.topicdesc = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









