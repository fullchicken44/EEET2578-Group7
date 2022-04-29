//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.7
//
// <auto-generated>
//
// Generated from file `Helper.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package helper;

public interface PreferenceWorkerPrx extends com.zeroc.Ice.ObjectPrx
{
    default User getUserInfo(String name)
    {
        return getUserInfo(name, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default User getUserInfo(String name, java.util.Map<String, String> context)
    {
        return _iceI_getUserInfoAsync(name, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<User> getUserInfoAsync(String name)
    {
        return _iceI_getUserInfoAsync(name, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<User> getUserInfoAsync(String name, java.util.Map<String, String> context)
    {
        return _iceI_getUserInfoAsync(name, context, false);
    }

    /**
     * @hidden
     * @param iceP_name -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<User> _iceI_getUserInfoAsync(String iceP_name, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<User> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getUserInfo", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_name);
                 }, istr -> {
                     User ret;
                     ret = User.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    default String getPreference(PreferenceRequest request)
    {
        return getPreference(request, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default String getPreference(PreferenceRequest request, java.util.Map<String, String> context)
    {
        return _iceI_getPreferenceAsync(request, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.String> getPreferenceAsync(PreferenceRequest request)
    {
        return _iceI_getPreferenceAsync(request, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.String> getPreferenceAsync(PreferenceRequest request, java.util.Map<String, String> context)
    {
        return _iceI_getPreferenceAsync(request, context, false);
    }

    /**
     * @hidden
     * @param iceP_request -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<java.lang.String> _iceI_getPreferenceAsync(PreferenceRequest iceP_request, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.String> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getPreference", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     PreferenceRequest.ice_write(ostr, iceP_request);
                 }, istr -> {
                     String ret;
                     ret = istr.readString();
                     return ret;
                 });
        return f;
    }

    default void terminate()
    {
        terminate(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void terminate(java.util.Map<String, String> context)
    {
        _iceI_terminateAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> terminateAsync()
    {
        return _iceI_terminateAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> terminateAsync(java.util.Map<String, String> context)
    {
        return _iceI_terminateAsync(context, false);
    }

    /**
     * @hidden
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_terminateAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "terminate", null, sync, null);
        f.invoke(false, context, null, null, null);
        return f;
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static PreferenceWorkerPrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), PreferenceWorkerPrx.class, _PreferenceWorkerPrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static PreferenceWorkerPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), PreferenceWorkerPrx.class, _PreferenceWorkerPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static PreferenceWorkerPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), PreferenceWorkerPrx.class, _PreferenceWorkerPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static PreferenceWorkerPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), PreferenceWorkerPrx.class, _PreferenceWorkerPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static PreferenceWorkerPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, PreferenceWorkerPrx.class, _PreferenceWorkerPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static PreferenceWorkerPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, PreferenceWorkerPrx.class, _PreferenceWorkerPrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default PreferenceWorkerPrx ice_context(java.util.Map<String, String> newContext)
    {
        return (PreferenceWorkerPrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default PreferenceWorkerPrx ice_adapterId(String newAdapterId)
    {
        return (PreferenceWorkerPrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default PreferenceWorkerPrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (PreferenceWorkerPrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default PreferenceWorkerPrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (PreferenceWorkerPrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default PreferenceWorkerPrx ice_invocationTimeout(int newTimeout)
    {
        return (PreferenceWorkerPrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default PreferenceWorkerPrx ice_connectionCached(boolean newCache)
    {
        return (PreferenceWorkerPrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default PreferenceWorkerPrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (PreferenceWorkerPrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default PreferenceWorkerPrx ice_secure(boolean b)
    {
        return (PreferenceWorkerPrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default PreferenceWorkerPrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (PreferenceWorkerPrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default PreferenceWorkerPrx ice_preferSecure(boolean b)
    {
        return (PreferenceWorkerPrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default PreferenceWorkerPrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (PreferenceWorkerPrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default PreferenceWorkerPrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (PreferenceWorkerPrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default PreferenceWorkerPrx ice_collocationOptimized(boolean b)
    {
        return (PreferenceWorkerPrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default PreferenceWorkerPrx ice_twoway()
    {
        return (PreferenceWorkerPrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default PreferenceWorkerPrx ice_oneway()
    {
        return (PreferenceWorkerPrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default PreferenceWorkerPrx ice_batchOneway()
    {
        return (PreferenceWorkerPrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default PreferenceWorkerPrx ice_datagram()
    {
        return (PreferenceWorkerPrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default PreferenceWorkerPrx ice_batchDatagram()
    {
        return (PreferenceWorkerPrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default PreferenceWorkerPrx ice_compress(boolean co)
    {
        return (PreferenceWorkerPrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default PreferenceWorkerPrx ice_timeout(int t)
    {
        return (PreferenceWorkerPrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default PreferenceWorkerPrx ice_connectionId(String connectionId)
    {
        return (PreferenceWorkerPrx)_ice_connectionId(connectionId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except it's a fixed proxy bound
     * the given connection.@param connection The fixed proxy connection.
     * @return A fixed proxy bound to the given connection.
     **/
    @Override
    default PreferenceWorkerPrx ice_fixed(com.zeroc.Ice.Connection connection)
    {
        return (PreferenceWorkerPrx)_ice_fixed(connection);
    }

    static String ice_staticId()
    {
        return "::helper::PreferenceWorker";
    }
}
