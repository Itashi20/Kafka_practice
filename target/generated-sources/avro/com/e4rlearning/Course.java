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
public class Course extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4249734181897122027L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Course\",\"namespace\":\"com.e4rlearning\",\"fields\":[{\"name\":\"course\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"cno\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"coursedesc\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"courselearn\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"costrupee\",\"type\":\"int\"},{\"name\":\"costusd\",\"type\":\"int\"},{\"name\":\"costeuro\",\"type\":\"int\"},{\"name\":\"chapters\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"chapters_record\",\"fields\":[{\"name\":\"chapter\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"hno\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"chapterdesc\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"topics\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"topics_record\",\"fields\":[{\"name\":\"topic\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"tno\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"topicdesc\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}},{\"name\":\"cocsw\",\"type\":\"boolean\"},{\"name\":\"cocswh\",\"type\":\"boolean\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Course> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Course> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Course> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Course> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Course> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Course to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Course from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Course instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Course fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String course;
  private java.lang.String cno;
  private java.lang.String coursedesc;
  private java.lang.String courselearn;
  private int costrupee;
  private int costusd;
  private int costeuro;
  private java.util.List<com.e4rlearning.chapters_record> chapters;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Course() {}

  /**
   * All-args constructor.
   * @param course The new value for course
   * @param cno The new value for cno
   * @param coursedesc The new value for coursedesc
   * @param courselearn The new value for courselearn
   * @param costrupee The new value for costrupee
   * @param costusd The new value for costusd
   * @param costeuro The new value for costeuro
   * @param chapters The new value for chapters
   */
  public Course(java.lang.String course, java.lang.String cno, java.lang.String coursedesc, java.lang.String courselearn, java.lang.Integer costrupee, java.lang.Integer costusd, java.lang.Integer costeuro, java.util.List<com.e4rlearning.chapters_record> chapters) {
    this.course = course;
    this.cno = cno;
    this.coursedesc = coursedesc;
    this.courselearn = courselearn;
    this.costrupee = costrupee;
    this.costusd = costusd;
    this.costeuro = costeuro;
    this.chapters = chapters;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return course;
    case 1: return cno;
    case 2: return coursedesc;
    case 3: return courselearn;
    case 4: return costrupee;
    case 5: return costusd;
    case 6: return costeuro;
    case 7: return chapters;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: course = value$ != null ? value$.toString() : null; break;
    case 1: cno = value$ != null ? value$.toString() : null; break;
    case 2: coursedesc = value$ != null ? value$.toString() : null; break;
    case 3: courselearn = value$ != null ? value$.toString() : null; break;
    case 4: costrupee = (java.lang.Integer)value$; break;
    case 5: costusd = (java.lang.Integer)value$; break;
    case 6: costeuro = (java.lang.Integer)value$; break;
    case 7: chapters = (java.util.List<com.e4rlearning.chapters_record>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'course' field.
   * @return The value of the 'course' field.
   */
  public java.lang.String getCourse() {
    return course;
  }


  /**
   * Sets the value of the 'course' field.
   * @param value the value to set.
   */
  public void setCourse(java.lang.String value) {
    this.course = value;
  }

  /**
   * Gets the value of the 'cno' field.
   * @return The value of the 'cno' field.
   */
  public java.lang.String getCno() {
    return cno;
  }


  /**
   * Sets the value of the 'cno' field.
   * @param value the value to set.
   */
  public void setCno(java.lang.String value) {
    this.cno = value;
  }

  /**
   * Gets the value of the 'coursedesc' field.
   * @return The value of the 'coursedesc' field.
   */
  public java.lang.String getCoursedesc() {
    return coursedesc;
  }


  /**
   * Sets the value of the 'coursedesc' field.
   * @param value the value to set.
   */
  public void setCoursedesc(java.lang.String value) {
    this.coursedesc = value;
  }

  /**
   * Gets the value of the 'courselearn' field.
   * @return The value of the 'courselearn' field.
   */
  public java.lang.String getCourselearn() {
    return courselearn;
  }


  /**
   * Sets the value of the 'courselearn' field.
   * @param value the value to set.
   */
  public void setCourselearn(java.lang.String value) {
    this.courselearn = value;
  }

  /**
   * Gets the value of the 'costrupee' field.
   * @return The value of the 'costrupee' field.
   */
  public int getCostrupee() {
    return costrupee;
  }


  /**
   * Sets the value of the 'costrupee' field.
   * @param value the value to set.
   */
  public void setCostrupee(int value) {
    this.costrupee = value;
  }

  /**
   * Gets the value of the 'costusd' field.
   * @return The value of the 'costusd' field.
   */
  public int getCostusd() {
    return costusd;
  }


  /**
   * Sets the value of the 'costusd' field.
   * @param value the value to set.
   */
  public void setCostusd(int value) {
    this.costusd = value;
  }

  /**
   * Gets the value of the 'costeuro' field.
   * @return The value of the 'costeuro' field.
   */
  public int getCosteuro() {
    return costeuro;
  }


  /**
   * Sets the value of the 'costeuro' field.
   * @param value the value to set.
   */
  public void setCosteuro(int value) {
    this.costeuro = value;
  }

  /**
   * Gets the value of the 'chapters' field.
   * @return The value of the 'chapters' field.
   */
  public java.util.List<com.e4rlearning.chapters_record> getChapters() {
    return chapters;
  }


  /**
   * Sets the value of the 'chapters' field.
   * @param value the value to set.
   */
  public void setChapters(java.util.List<com.e4rlearning.chapters_record> value) {
    this.chapters = value;
  }

  /**
   * Creates a new Course RecordBuilder.
   * @return A new Course RecordBuilder
   */
  public static com.e4rlearning.Course.Builder newBuilder() {
    return new com.e4rlearning.Course.Builder();
  }

  /**
   * Creates a new Course RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Course RecordBuilder
   */
  public static com.e4rlearning.Course.Builder newBuilder(com.e4rlearning.Course.Builder other) {
    if (other == null) {
      return new com.e4rlearning.Course.Builder();
    } else {
      return new com.e4rlearning.Course.Builder(other);
    }
  }

  /**
   * Creates a new Course RecordBuilder by copying an existing Course instance.
   * @param other The existing instance to copy.
   * @return A new Course RecordBuilder
   */
  public static com.e4rlearning.Course.Builder newBuilder(com.e4rlearning.Course other) {
    if (other == null) {
      return new com.e4rlearning.Course.Builder();
    } else {
      return new com.e4rlearning.Course.Builder(other);
    }
  }

  /**
   * RecordBuilder for Course instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Course>
    implements org.apache.avro.data.RecordBuilder<Course> {

    private java.lang.String course;
    private java.lang.String cno;
    private java.lang.String coursedesc;
    private java.lang.String courselearn;
    private int costrupee;
    private int costusd;
    private int costeuro;
    private java.util.List<com.e4rlearning.chapters_record> chapters;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.e4rlearning.Course.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.course)) {
        this.course = data().deepCopy(fields()[0].schema(), other.course);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.cno)) {
        this.cno = data().deepCopy(fields()[1].schema(), other.cno);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.coursedesc)) {
        this.coursedesc = data().deepCopy(fields()[2].schema(), other.coursedesc);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.courselearn)) {
        this.courselearn = data().deepCopy(fields()[3].schema(), other.courselearn);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.costrupee)) {
        this.costrupee = data().deepCopy(fields()[4].schema(), other.costrupee);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.costusd)) {
        this.costusd = data().deepCopy(fields()[5].schema(), other.costusd);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.costeuro)) {
        this.costeuro = data().deepCopy(fields()[6].schema(), other.costeuro);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.chapters)) {
        this.chapters = data().deepCopy(fields()[7].schema(), other.chapters);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
    }

    /**
     * Creates a Builder by copying an existing Course instance
     * @param other The existing instance to copy.
     */
    private Builder(com.e4rlearning.Course other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.course)) {
        this.course = data().deepCopy(fields()[0].schema(), other.course);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.cno)) {
        this.cno = data().deepCopy(fields()[1].schema(), other.cno);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.coursedesc)) {
        this.coursedesc = data().deepCopy(fields()[2].schema(), other.coursedesc);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.courselearn)) {
        this.courselearn = data().deepCopy(fields()[3].schema(), other.courselearn);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.costrupee)) {
        this.costrupee = data().deepCopy(fields()[4].schema(), other.costrupee);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.costusd)) {
        this.costusd = data().deepCopy(fields()[5].schema(), other.costusd);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.costeuro)) {
        this.costeuro = data().deepCopy(fields()[6].schema(), other.costeuro);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.chapters)) {
        this.chapters = data().deepCopy(fields()[7].schema(), other.chapters);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'course' field.
      * @return The value.
      */
    public java.lang.String getCourse() {
      return course;
    }


    /**
      * Sets the value of the 'course' field.
      * @param value The value of 'course'.
      * @return This builder.
      */
    public com.e4rlearning.Course.Builder setCourse(java.lang.String value) {
      validate(fields()[0], value);
      this.course = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'course' field has been set.
      * @return True if the 'course' field has been set, false otherwise.
      */
    public boolean hasCourse() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'course' field.
      * @return This builder.
      */
    public com.e4rlearning.Course.Builder clearCourse() {
      course = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'cno' field.
      * @return The value.
      */
    public java.lang.String getCno() {
      return cno;
    }


    /**
      * Sets the value of the 'cno' field.
      * @param value The value of 'cno'.
      * @return This builder.
      */
    public com.e4rlearning.Course.Builder setCno(java.lang.String value) {
      validate(fields()[1], value);
      this.cno = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'cno' field has been set.
      * @return True if the 'cno' field has been set, false otherwise.
      */
    public boolean hasCno() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'cno' field.
      * @return This builder.
      */
    public com.e4rlearning.Course.Builder clearCno() {
      cno = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'coursedesc' field.
      * @return The value.
      */
    public java.lang.String getCoursedesc() {
      return coursedesc;
    }


    /**
      * Sets the value of the 'coursedesc' field.
      * @param value The value of 'coursedesc'.
      * @return This builder.
      */
    public com.e4rlearning.Course.Builder setCoursedesc(java.lang.String value) {
      validate(fields()[2], value);
      this.coursedesc = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'coursedesc' field has been set.
      * @return True if the 'coursedesc' field has been set, false otherwise.
      */
    public boolean hasCoursedesc() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'coursedesc' field.
      * @return This builder.
      */
    public com.e4rlearning.Course.Builder clearCoursedesc() {
      coursedesc = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'courselearn' field.
      * @return The value.
      */
    public java.lang.String getCourselearn() {
      return courselearn;
    }


    /**
      * Sets the value of the 'courselearn' field.
      * @param value The value of 'courselearn'.
      * @return This builder.
      */
    public com.e4rlearning.Course.Builder setCourselearn(java.lang.String value) {
      validate(fields()[3], value);
      this.courselearn = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'courselearn' field has been set.
      * @return True if the 'courselearn' field has been set, false otherwise.
      */
    public boolean hasCourselearn() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'courselearn' field.
      * @return This builder.
      */
    public com.e4rlearning.Course.Builder clearCourselearn() {
      courselearn = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'costrupee' field.
      * @return The value.
      */
    public int getCostrupee() {
      return costrupee;
    }


    /**
      * Sets the value of the 'costrupee' field.
      * @param value The value of 'costrupee'.
      * @return This builder.
      */
    public com.e4rlearning.Course.Builder setCostrupee(int value) {
      validate(fields()[4], value);
      this.costrupee = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'costrupee' field has been set.
      * @return True if the 'costrupee' field has been set, false otherwise.
      */
    public boolean hasCostrupee() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'costrupee' field.
      * @return This builder.
      */
    public com.e4rlearning.Course.Builder clearCostrupee() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'costusd' field.
      * @return The value.
      */
    public int getCostusd() {
      return costusd;
    }


    /**
      * Sets the value of the 'costusd' field.
      * @param value The value of 'costusd'.
      * @return This builder.
      */
    public com.e4rlearning.Course.Builder setCostusd(int value) {
      validate(fields()[5], value);
      this.costusd = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'costusd' field has been set.
      * @return True if the 'costusd' field has been set, false otherwise.
      */
    public boolean hasCostusd() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'costusd' field.
      * @return This builder.
      */
    public com.e4rlearning.Course.Builder clearCostusd() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'costeuro' field.
      * @return The value.
      */
    public int getCosteuro() {
      return costeuro;
    }


    /**
      * Sets the value of the 'costeuro' field.
      * @param value The value of 'costeuro'.
      * @return This builder.
      */
    public com.e4rlearning.Course.Builder setCosteuro(int value) {
      validate(fields()[6], value);
      this.costeuro = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'costeuro' field has been set.
      * @return True if the 'costeuro' field has been set, false otherwise.
      */
    public boolean hasCosteuro() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'costeuro' field.
      * @return This builder.
      */
    public com.e4rlearning.Course.Builder clearCosteuro() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'chapters' field.
      * @return The value.
      */
    public java.util.List<com.e4rlearning.chapters_record> getChapters() {
      return chapters;
    }


    /**
      * Sets the value of the 'chapters' field.
      * @param value The value of 'chapters'.
      * @return This builder.
      */
    public com.e4rlearning.Course.Builder setChapters(java.util.List<com.e4rlearning.chapters_record> value) {
      validate(fields()[7], value);
      this.chapters = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'chapters' field has been set.
      * @return True if the 'chapters' field has been set, false otherwise.
      */
    public boolean hasChapters() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'chapters' field.
      * @return This builder.
      */
    public com.e4rlearning.Course.Builder clearChapters() {
      chapters = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Course build() {
      try {
        Course record = new Course();
        record.course = fieldSetFlags()[0] ? this.course : (java.lang.String) defaultValue(fields()[0]);
        record.cno = fieldSetFlags()[1] ? this.cno : (java.lang.String) defaultValue(fields()[1]);
        record.coursedesc = fieldSetFlags()[2] ? this.coursedesc : (java.lang.String) defaultValue(fields()[2]);
        record.courselearn = fieldSetFlags()[3] ? this.courselearn : (java.lang.String) defaultValue(fields()[3]);
        record.costrupee = fieldSetFlags()[4] ? this.costrupee : (java.lang.Integer) defaultValue(fields()[4]);
        record.costusd = fieldSetFlags()[5] ? this.costusd : (java.lang.Integer) defaultValue(fields()[5]);
        record.costeuro = fieldSetFlags()[6] ? this.costeuro : (java.lang.Integer) defaultValue(fields()[6]);
        record.chapters = fieldSetFlags()[7] ? this.chapters : (java.util.List<com.e4rlearning.chapters_record>) defaultValue(fields()[7]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Course>
    WRITER$ = (org.apache.avro.io.DatumWriter<Course>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Course>
    READER$ = (org.apache.avro.io.DatumReader<Course>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.course);

    out.writeString(this.cno);

    out.writeString(this.coursedesc);

    out.writeString(this.courselearn);

    out.writeInt(this.costrupee);

    out.writeInt(this.costusd);

    out.writeInt(this.costeuro);

    long size0 = this.chapters.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.e4rlearning.chapters_record e0: this.chapters) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.course = in.readString();

      this.cno = in.readString();

      this.coursedesc = in.readString();

      this.courselearn = in.readString();

      this.costrupee = in.readInt();

      this.costusd = in.readInt();

      this.costeuro = in.readInt();

      long size0 = in.readArrayStart();
      java.util.List<com.e4rlearning.chapters_record> a0 = this.chapters;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.e4rlearning.chapters_record>((int)size0, SCHEMA$.getField("chapters").schema());
        this.chapters = a0;
      } else a0.clear();
      SpecificData.Array<com.e4rlearning.chapters_record> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.e4rlearning.chapters_record>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          com.e4rlearning.chapters_record e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new com.e4rlearning.chapters_record();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 8; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.course = in.readString();
          break;

        case 1:
          this.cno = in.readString();
          break;

        case 2:
          this.coursedesc = in.readString();
          break;

        case 3:
          this.courselearn = in.readString();
          break;

        case 4:
          this.costrupee = in.readInt();
          break;

        case 5:
          this.costusd = in.readInt();
          break;

        case 6:
          this.costeuro = in.readInt();
          break;

        case 7:
          long size0 = in.readArrayStart();
          java.util.List<com.e4rlearning.chapters_record> a0 = this.chapters;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.e4rlearning.chapters_record>((int)size0, SCHEMA$.getField("chapters").schema());
            this.chapters = a0;
          } else a0.clear();
          SpecificData.Array<com.e4rlearning.chapters_record> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.e4rlearning.chapters_record>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              com.e4rlearning.chapters_record e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new com.e4rlearning.chapters_record();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










