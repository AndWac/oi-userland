#
# This file and its contents are supplied under the terms of the
# Common Development and Distribution License ("CDDL"), version 1.0.
# You may only use this file in accordance with the terms of version
# 1.0 of the CDDL.
#
# A full copy of the text of the CDDL should have accompanied this
# source.  A copy of the CDDL is also available via the Internet at
# http://www.illumos.org/license/CDDL.
#

#
# This file was automatically generated using the following command:
#   $WS_TOOLS/perl-integrate-module Term::Table
#

BUILD_STYLE = makemaker

include ../../../make-rules/shared-macros.mk

COMPONENT_PERL_MODULE =		Term::Table
HUMAN_VERSION =			0.022
COMPONENT_SUMMARY =		Term::Table - Format a header and rows into a table
COMPONENT_CPAN_AUTHOR =		EXODIST
COMPONENT_ARCHIVE_HASH =	\
	sha256:b9dbdacfa7362846e3c4a100081832db9da74b7356828ef9d92869c44642e0b8
COMPONENT_LICENSE =		Artistic-1.0-Perl OR GPL-1.0-or-later
COMPONENT_LICENSE_FILE =	LICENSE

# Term::Table has been added to Perl 5.40 core
PERL_VERSIONS := $(filter 5.36 5.38, $(PERL_VERSIONS))

include $(WS_MAKE_RULES)/common.mk

# Auto-generated dependencies
PERL_REQUIRED_PACKAGES += library/perl-5/term-size-any
PERL_REQUIRED_PACKAGES += library/perl-5/unicode-linebreak
PERL_REQUIRED_PACKAGES += runtime/perl
