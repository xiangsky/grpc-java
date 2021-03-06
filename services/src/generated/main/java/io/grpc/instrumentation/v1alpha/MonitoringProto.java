// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/instrumentation/v1alpha/monitoring.proto

package io.grpc.instrumentation.v1alpha;

public final class MonitoringProto {
  private MonitoringProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_instrumentation_v1alpha_CanonicalRpcStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_instrumentation_v1alpha_CanonicalRpcStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_instrumentation_v1alpha_CanonicalRpcStats_View_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_instrumentation_v1alpha_CanonicalRpcStats_View_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_instrumentation_v1alpha_StatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_instrumentation_v1alpha_StatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_instrumentation_v1alpha_StatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_instrumentation_v1alpha_StatsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_instrumentation_v1alpha_TraceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_instrumentation_v1alpha_TraceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_instrumentation_v1alpha_TraceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_instrumentation_v1alpha_TraceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_instrumentation_v1alpha_MonitoringDataGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_instrumentation_v1alpha_MonitoringDataGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_instrumentation_v1alpha_CustomMonitoringData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_instrumentation_v1alpha_CustomMonitoringData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-grpc/instrumentation/v1alpha/monitorin" +
      "g.proto\022\034grpc.instrumentation.v1alpha\032#g" +
      "oogle/instrumentation/census.proto\032\031goog" +
      "le/protobuf/any.proto\032\033google/protobuf/e" +
      "mpty.proto\"\261\r\n\021CanonicalRpcStats\022O\n\021rpc_" +
      "client_errors\030\001 \001(\01324.grpc.instrumentati" +
      "on.v1alpha.CanonicalRpcStats.View\022W\n\031rpc" +
      "_client_completed_rpcs\030\002 \001(\01324.grpc.inst" +
      "rumentation.v1alpha.CanonicalRpcStats.Vi" +
      "ew\022U\n\027rpc_client_started_rpcs\030\003 \001(\01324.gr",
      "pc.instrumentation.v1alpha.CanonicalRpcS" +
      "tats.View\022U\n\027rpc_client_elapsed_time\030\004 \001" +
      "(\01324.grpc.instrumentation.v1alpha.Canoni" +
      "calRpcStats.View\022\\\n\036rpc_client_server_el" +
      "apsed_time\030\005 \001(\01324.grpc.instrumentation." +
      "v1alpha.CanonicalRpcStats.View\022V\n\030rpc_cl" +
      "ient_request_bytes\030\006 \001(\01324.grpc.instrume" +
      "ntation.v1alpha.CanonicalRpcStats.View\022W" +
      "\n\031rpc_client_response_bytes\030\007 \001(\01324.grpc" +
      ".instrumentation.v1alpha.CanonicalRpcSta",
      "ts.View\022V\n\030rpc_client_request_count\030\010 \001(" +
      "\01324.grpc.instrumentation.v1alpha.Canonic" +
      "alRpcStats.View\022W\n\031rpc_client_response_c" +
      "ount\030\t \001(\01324.grpc.instrumentation.v1alph" +
      "a.CanonicalRpcStats.View\022O\n\021rpc_server_e" +
      "rrors\030\n \001(\01324.grpc.instrumentation.v1alp" +
      "ha.CanonicalRpcStats.View\022W\n\031rpc_server_" +
      "completed_rpcs\030\013 \001(\01324.grpc.instrumentat" +
      "ion.v1alpha.CanonicalRpcStats.View\022\\\n\036rp" +
      "c_server_server_elapsed_time\030\014 \001(\01324.grp",
      "c.instrumentation.v1alpha.CanonicalRpcSt" +
      "ats.View\022V\n\030rpc_server_request_bytes\030\r \001" +
      "(\01324.grpc.instrumentation.v1alpha.Canoni" +
      "calRpcStats.View\022W\n\031rpc_server_response_" +
      "bytes\030\016 \001(\01324.grpc.instrumentation.v1alp" +
      "ha.CanonicalRpcStats.View\022V\n\030rpc_server_" +
      "request_count\030\017 \001(\01324.grpc.instrumentati" +
      "on.v1alpha.CanonicalRpcStats.View\022W\n\031rpc" +
      "_server_response_count\030\020 \001(\01324.grpc.inst" +
      "rumentation.v1alpha.CanonicalRpcStats.Vi",
      "ew\022U\n\027rpc_server_elapsed_time\030\021 \001(\01324.gr" +
      "pc.instrumentation.v1alpha.CanonicalRpcS" +
      "tats.View\032\302\001\n\004View\022M\n\026measurement_descri" +
      "ptor\030\001 \001(\0132-.google.instrumentation.Meas" +
      "urementDescriptor\022?\n\017view_descriptor\030\002 \001" +
      "(\0132&.google.instrumentation.ViewDescript" +
      "or\022*\n\004view\030\003 \001(\0132\034.google.instrumentatio" +
      "n.View\"\016\n\014StatsRequest\"\017\n\rStatsResponse\"" +
      "\016\n\014TraceRequest\"\017\n\rTraceResponse\"#\n\023Moni" +
      "toringDataGroup\022\014\n\004name\030\001 \001(\t\">\n\024CustomM",
      "onitoringData\022&\n\010contents\030\001 \001(\0132\024.google" +
      ".protobuf.Any2\265\004\n\nMonitoring\022a\n\024GetCanon" +
      "icalRpcStats\022\026.google.protobuf.Empty\032/.g" +
      "rpc.instrumentation.v1alpha.CanonicalRpc" +
      "Stats\"\000\022e\n\010GetStats\022*.grpc.instrumentati" +
      "on.v1alpha.StatsRequest\032+.grpc.instrumen" +
      "tation.v1alpha.StatsResponse\"\000\022i\n\nWatchS" +
      "tats\022*.grpc.instrumentation.v1alpha.Stat" +
      "sRequest\032+.grpc.instrumentation.v1alpha." +
      "StatsResponse\"\0000\001\022m\n\020GetRequestTraces\022*.",
      "grpc.instrumentation.v1alpha.TraceReques" +
      "t\032+.grpc.instrumentation.v1alpha.TraceRe" +
      "sponse\"\000\022\202\001\n\027GetCustomMonitoringData\0221.g" +
      "rpc.instrumentation.v1alpha.MonitoringDa" +
      "taGroup\0322.grpc.instrumentation.v1alpha.C" +
      "ustomMonitoringData\"\000B4\n\037io.grpc.instrum" +
      "entation.v1alphaB\017MonitoringProtoP\001b\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.instrumentation.stats.proto.CensusProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_grpc_instrumentation_v1alpha_CanonicalRpcStats_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_instrumentation_v1alpha_CanonicalRpcStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_instrumentation_v1alpha_CanonicalRpcStats_descriptor,
        new java.lang.String[] { "RpcClientErrors", "RpcClientCompletedRpcs", "RpcClientStartedRpcs", "RpcClientElapsedTime", "RpcClientServerElapsedTime", "RpcClientRequestBytes", "RpcClientResponseBytes", "RpcClientRequestCount", "RpcClientResponseCount", "RpcServerErrors", "RpcServerCompletedRpcs", "RpcServerServerElapsedTime", "RpcServerRequestBytes", "RpcServerResponseBytes", "RpcServerRequestCount", "RpcServerResponseCount", "RpcServerElapsedTime", });
    internal_static_grpc_instrumentation_v1alpha_CanonicalRpcStats_View_descriptor =
      internal_static_grpc_instrumentation_v1alpha_CanonicalRpcStats_descriptor.getNestedTypes().get(0);
    internal_static_grpc_instrumentation_v1alpha_CanonicalRpcStats_View_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_instrumentation_v1alpha_CanonicalRpcStats_View_descriptor,
        new java.lang.String[] { "MeasurementDescriptor", "ViewDescriptor", "View", });
    internal_static_grpc_instrumentation_v1alpha_StatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_instrumentation_v1alpha_StatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_instrumentation_v1alpha_StatsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_grpc_instrumentation_v1alpha_StatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grpc_instrumentation_v1alpha_StatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_instrumentation_v1alpha_StatsResponse_descriptor,
        new java.lang.String[] { });
    internal_static_grpc_instrumentation_v1alpha_TraceRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_grpc_instrumentation_v1alpha_TraceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_instrumentation_v1alpha_TraceRequest_descriptor,
        new java.lang.String[] { });
    internal_static_grpc_instrumentation_v1alpha_TraceResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_grpc_instrumentation_v1alpha_TraceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_instrumentation_v1alpha_TraceResponse_descriptor,
        new java.lang.String[] { });
    internal_static_grpc_instrumentation_v1alpha_MonitoringDataGroup_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_grpc_instrumentation_v1alpha_MonitoringDataGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_instrumentation_v1alpha_MonitoringDataGroup_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_grpc_instrumentation_v1alpha_CustomMonitoringData_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_grpc_instrumentation_v1alpha_CustomMonitoringData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_instrumentation_v1alpha_CustomMonitoringData_descriptor,
        new java.lang.String[] { "Contents", });
    com.google.instrumentation.stats.proto.CensusProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
