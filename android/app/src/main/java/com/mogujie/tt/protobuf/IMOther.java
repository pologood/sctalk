// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IM.Other.proto

package com.mogujie.tt.protobuf;

public final class IMOther {
  private IMOther() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface IMHeartBeatOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IM.Other.IMHeartBeat)
      com.google.protobuf.MessageLiteOrBuilder {
  }
  /**
   * <pre>
   *cmd id:  		0x0701
   * </pre>
   *
   * Protobuf type {@code IM.Other.IMHeartBeat}
   */
  public  static final class IMHeartBeat extends
      com.google.protobuf.GeneratedMessageLite<
          IMHeartBeat, IMHeartBeat.Builder> implements
      // @@protoc_insertion_point(message_implements:IM.Other.IMHeartBeat)
      IMHeartBeatOrBuilder {
    private IMHeartBeat() {
    }
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.mogujie.tt.protobuf.IMOther.IMHeartBeat parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.mogujie.tt.protobuf.IMOther.IMHeartBeat parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.mogujie.tt.protobuf.IMOther.IMHeartBeat parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.mogujie.tt.protobuf.IMOther.IMHeartBeat parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.mogujie.tt.protobuf.IMOther.IMHeartBeat parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.mogujie.tt.protobuf.IMOther.IMHeartBeat parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.mogujie.tt.protobuf.IMOther.IMHeartBeat parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.mogujie.tt.protobuf.IMOther.IMHeartBeat parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.mogujie.tt.protobuf.IMOther.IMHeartBeat parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.mogujie.tt.protobuf.IMOther.IMHeartBeat parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.mogujie.tt.protobuf.IMOther.IMHeartBeat prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     *cmd id:  		0x0701
     * </pre>
     *
     * Protobuf type {@code IM.Other.IMHeartBeat}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.mogujie.tt.protobuf.IMOther.IMHeartBeat, Builder> implements
        // @@protoc_insertion_point(builder_implements:IM.Other.IMHeartBeat)
        com.mogujie.tt.protobuf.IMOther.IMHeartBeatOrBuilder {
      // Construct using com.mogujie.tt.protobuf.IMOther.IMHeartBeat.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:IM.Other.IMHeartBeat)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.mogujie.tt.protobuf.IMOther.IMHeartBeat();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.mogujie.tt.protobuf.IMOther.IMHeartBeat other = (com.mogujie.tt.protobuf.IMOther.IMHeartBeat) arg1;
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (com.mogujie.tt.protobuf.IMOther.IMHeartBeat.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:IM.Other.IMHeartBeat)
    private static final com.mogujie.tt.protobuf.IMOther.IMHeartBeat DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new IMHeartBeat();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static com.mogujie.tt.protobuf.IMOther.IMHeartBeat getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<IMHeartBeat> PARSER;

    public static com.google.protobuf.Parser<IMHeartBeat> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
