package ch.cyberduck.ui.cocoa.datasource;

/*
 * Copyright (c) 2002-2016 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import ch.cyberduck.core.Cache;
import ch.cyberduck.core.pool.SessionPool;
import ch.cyberduck.core.transfer.Transfer;
import ch.cyberduck.core.transfer.TransferItem;
import ch.cyberduck.ui.cocoa.controller.TransferPromptController;

public class UploadPromptDataSource extends TransferPromptDataSource {

    public UploadPromptDataSource(final TransferPromptController c,
                                  final SessionPool source, final SessionPool destination,
                                  final Transfer transfer, final Cache<TransferItem> cache) {
        super(c, source, destination, transfer, cache);
    }
}