package com.v2t.client.injector;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.v2t.client.ServerDispatchAsync;
import com.v2t.client.module.ClientModule;

@GinModules( ClientModule.class )
public interface ApplicationInjector extends Ginjector {
	public ServerDispatchAsync getServerDispatch();
}
