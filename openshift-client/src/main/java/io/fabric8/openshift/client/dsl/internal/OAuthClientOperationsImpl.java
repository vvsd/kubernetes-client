/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.openshift.client.dsl.internal;

import com.squareup.okhttp.OkHttpClient;
import io.fabric8.kubernetes.client.dsl.ClientResource;
import io.fabric8.openshift.api.model.DoneableOAuthClient;
import io.fabric8.openshift.api.model.OAuthClient;
import io.fabric8.openshift.api.model.OAuthClientList;
import io.fabric8.openshift.client.OpenShiftConfig;

public class OAuthClientOperationsImpl extends OpenShiftOperation<OAuthClient, OAuthClientList, DoneableOAuthClient,
  ClientResource<OAuthClient, DoneableOAuthClient>> {

  public OAuthClientOperationsImpl(OkHttpClient client, OpenShiftConfig config) {
    this(client, config, null, null, null, true, null, null);
  }

  public OAuthClientOperationsImpl(OkHttpClient client, OpenShiftConfig config, String apiVersion, String namespace, String name, Boolean cascading, OAuthClient item, String resourceVersion) {
    super(client, config, null, apiVersion, "oauthclients", namespace, name, cascading, item, resourceVersion);
  }

  @Override
  public boolean isNamespaceRequired() {
    return false;
  }
}
