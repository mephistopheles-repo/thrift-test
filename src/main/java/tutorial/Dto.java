/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tutorial;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-10-23")
public class Dto implements org.apache.thrift.TBase<Dto, Dto._Fields>, java.io.Serializable, Cloneable, Comparable<Dto> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Dto");

  private static final org.apache.thrift.protocol.TField A_FIELD_DESC = new org.apache.thrift.protocol.TField("a", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField B_FIELD_DESC = new org.apache.thrift.protocol.TField("b", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SA_FIELD_DESC = new org.apache.thrift.protocol.TField("sa", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SB_FIELD_DESC = new org.apache.thrift.protocol.TField("sb", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DtoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DtoTupleSchemeFactory());
  }

  public int a; // required
  public int b; // required
  public String sa; // required
  public String sb; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    A((short)1, "a"),
    B((short)2, "b"),
    SA((short)3, "sa"),
    SB((short)4, "sb");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // A
          return A;
        case 2: // B
          return B;
        case 3: // SA
          return SA;
        case 4: // SB
          return SB;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __A_ISSET_ID = 0;
  private static final int __B_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.A, new org.apache.thrift.meta_data.FieldMetaData("a", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.B, new org.apache.thrift.meta_data.FieldMetaData("b", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SA, new org.apache.thrift.meta_data.FieldMetaData("sa", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SB, new org.apache.thrift.meta_data.FieldMetaData("sb", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Dto.class, metaDataMap);
  }

  public Dto() {
  }

  public Dto(
    int a,
    int b,
    String sa,
    String sb)
  {
    this();
    this.a = a;
    setAIsSet(true);
    this.b = b;
    setBIsSet(true);
    this.sa = sa;
    this.sb = sb;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Dto(Dto other) {
    __isset_bitfield = other.__isset_bitfield;
    this.a = other.a;
    this.b = other.b;
    if (other.isSetSa()) {
      this.sa = other.sa;
    }
    if (other.isSetSb()) {
      this.sb = other.sb;
    }
  }

  public Dto deepCopy() {
    return new Dto(this);
  }

  @Override
  public void clear() {
    setAIsSet(false);
    this.a = 0;
    setBIsSet(false);
    this.b = 0;
    this.sa = null;
    this.sb = null;
  }

  public int getA() {
    return this.a;
  }

  public Dto setA(int a) {
    this.a = a;
    setAIsSet(true);
    return this;
  }

  public void unsetA() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __A_ISSET_ID);
  }

  /** Returns true if field a is set (has been assigned a value) and false otherwise */
  public boolean isSetA() {
    return EncodingUtils.testBit(__isset_bitfield, __A_ISSET_ID);
  }

  public void setAIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __A_ISSET_ID, value);
  }

  public int getB() {
    return this.b;
  }

  public Dto setB(int b) {
    this.b = b;
    setBIsSet(true);
    return this;
  }

  public void unsetB() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __B_ISSET_ID);
  }

  /** Returns true if field b is set (has been assigned a value) and false otherwise */
  public boolean isSetB() {
    return EncodingUtils.testBit(__isset_bitfield, __B_ISSET_ID);
  }

  public void setBIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __B_ISSET_ID, value);
  }

  public String getSa() {
    return this.sa;
  }

  public Dto setSa(String sa) {
    this.sa = sa;
    return this;
  }

  public void unsetSa() {
    this.sa = null;
  }

  /** Returns true if field sa is set (has been assigned a value) and false otherwise */
  public boolean isSetSa() {
    return this.sa != null;
  }

  public void setSaIsSet(boolean value) {
    if (!value) {
      this.sa = null;
    }
  }

  public String getSb() {
    return this.sb;
  }

  public Dto setSb(String sb) {
    this.sb = sb;
    return this;
  }

  public void unsetSb() {
    this.sb = null;
  }

  /** Returns true if field sb is set (has been assigned a value) and false otherwise */
  public boolean isSetSb() {
    return this.sb != null;
  }

  public void setSbIsSet(boolean value) {
    if (!value) {
      this.sb = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case A:
      if (value == null) {
        unsetA();
      } else {
        setA((Integer)value);
      }
      break;

    case B:
      if (value == null) {
        unsetB();
      } else {
        setB((Integer)value);
      }
      break;

    case SA:
      if (value == null) {
        unsetSa();
      } else {
        setSa((String)value);
      }
      break;

    case SB:
      if (value == null) {
        unsetSb();
      } else {
        setSb((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case A:
      return getA();

    case B:
      return getB();

    case SA:
      return getSa();

    case SB:
      return getSb();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case A:
      return isSetA();
    case B:
      return isSetB();
    case SA:
      return isSetSa();
    case SB:
      return isSetSb();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Dto)
      return this.equals((Dto)that);
    return false;
  }

  public boolean equals(Dto that) {
    if (that == null)
      return false;

    boolean this_present_a = true;
    boolean that_present_a = true;
    if (this_present_a || that_present_a) {
      if (!(this_present_a && that_present_a))
        return false;
      if (this.a != that.a)
        return false;
    }

    boolean this_present_b = true;
    boolean that_present_b = true;
    if (this_present_b || that_present_b) {
      if (!(this_present_b && that_present_b))
        return false;
      if (this.b != that.b)
        return false;
    }

    boolean this_present_sa = true && this.isSetSa();
    boolean that_present_sa = true && that.isSetSa();
    if (this_present_sa || that_present_sa) {
      if (!(this_present_sa && that_present_sa))
        return false;
      if (!this.sa.equals(that.sa))
        return false;
    }

    boolean this_present_sb = true && this.isSetSb();
    boolean that_present_sb = true && that.isSetSb();
    if (this_present_sb || that_present_sb) {
      if (!(this_present_sb && that_present_sb))
        return false;
      if (!this.sb.equals(that.sb))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_a = true;
    list.add(present_a);
    if (present_a)
      list.add(a);

    boolean present_b = true;
    list.add(present_b);
    if (present_b)
      list.add(b);

    boolean present_sa = true && (isSetSa());
    list.add(present_sa);
    if (present_sa)
      list.add(sa);

    boolean present_sb = true && (isSetSb());
    list.add(present_sb);
    if (present_sb)
      list.add(sb);

    return list.hashCode();
  }

  @Override
  public int compareTo(Dto other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetA()).compareTo(other.isSetA());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetA()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.a, other.a);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetB()).compareTo(other.isSetB());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetB()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.b, other.b);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSa()).compareTo(other.isSetSa());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSa()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sa, other.sa);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSb()).compareTo(other.isSetSb());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSb()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sb, other.sb);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Dto(");
    boolean first = true;

    sb.append("a:");
    sb.append(this.a);
    first = false;
    if (!first) sb.append(", ");
    sb.append("b:");
    sb.append(this.b);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sa:");
    if (this.sa == null) {
      sb.append("null");
    } else {
      sb.append(this.sa);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sb:");
    if (this.sb == null) {
      sb.append("null");
    } else {
      sb.append(this.sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DtoStandardSchemeFactory implements SchemeFactory {
    public DtoStandardScheme getScheme() {
      return new DtoStandardScheme();
    }
  }

  private static class DtoStandardScheme extends StandardScheme<Dto> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Dto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // A
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.a = iprot.readI32();
              struct.setAIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // B
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.b = iprot.readI32();
              struct.setBIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sa = iprot.readString();
              struct.setSaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sb = iprot.readString();
              struct.setSbIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Dto struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(A_FIELD_DESC);
      oprot.writeI32(struct.a);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(B_FIELD_DESC);
      oprot.writeI32(struct.b);
      oprot.writeFieldEnd();
      if (struct.sa != null) {
        oprot.writeFieldBegin(SA_FIELD_DESC);
        oprot.writeString(struct.sa);
        oprot.writeFieldEnd();
      }
      if (struct.sb != null) {
        oprot.writeFieldBegin(SB_FIELD_DESC);
        oprot.writeString(struct.sb);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DtoTupleSchemeFactory implements SchemeFactory {
    public DtoTupleScheme getScheme() {
      return new DtoTupleScheme();
    }
  }

  private static class DtoTupleScheme extends TupleScheme<Dto> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Dto struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetA()) {
        optionals.set(0);
      }
      if (struct.isSetB()) {
        optionals.set(1);
      }
      if (struct.isSetSa()) {
        optionals.set(2);
      }
      if (struct.isSetSb()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetA()) {
        oprot.writeI32(struct.a);
      }
      if (struct.isSetB()) {
        oprot.writeI32(struct.b);
      }
      if (struct.isSetSa()) {
        oprot.writeString(struct.sa);
      }
      if (struct.isSetSb()) {
        oprot.writeString(struct.sb);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Dto struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.a = iprot.readI32();
        struct.setAIsSet(true);
      }
      if (incoming.get(1)) {
        struct.b = iprot.readI32();
        struct.setBIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sa = iprot.readString();
        struct.setSaIsSet(true);
      }
      if (incoming.get(3)) {
        struct.sb = iprot.readString();
        struct.setSbIsSet(true);
      }
    }
  }

}
