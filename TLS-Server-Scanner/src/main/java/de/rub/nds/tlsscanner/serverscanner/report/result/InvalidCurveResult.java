/**
 * TLS-Scanner - A TLS configuration and analysis tool based on TLS-Attacker.
 *
 * Copyright 2017-2019 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.tlsscanner.serverscanner.report.result;

import de.rub.nds.tlsscanner.serverscanner.constants.ProbeType;
import de.rub.nds.tlsscanner.serverscanner.probe.invalidCurve.InvalidCurveResponse;
import de.rub.nds.tlsscanner.serverscanner.rating.TestResult;
import de.rub.nds.tlsscanner.serverscanner.report.AnalyzedProperty;
import de.rub.nds.tlsscanner.serverscanner.report.SiteReport;
import java.util.List;

/**
 *
 * @author Robert Merget <robert.merget@rub.de>
 */
public class InvalidCurveResult extends ProbeResult {

    private final TestResult vulnerableClassic;
    private final TestResult vulnerableEphemeral;
    private final TestResult vulnerableTwist;
    private final List<InvalidCurveResponse> responses;

    public InvalidCurveResult(TestResult vulnerableClassic, TestResult vulnerableEphemeral, TestResult vulnerableTwist,
            List<InvalidCurveResponse> responses) {
        super(ProbeType.INVALID_CURVE);
        this.vulnerableClassic = vulnerableClassic;
        this.vulnerableEphemeral = vulnerableEphemeral;
        this.vulnerableTwist = vulnerableTwist;
        this.responses = responses;
    }

    @Override
    public void mergeData(SiteReport report) {
        report.putResult(AnalyzedProperty.VULNERABLE_TO_INVALID_CURVE, vulnerableClassic);
        report.putResult(AnalyzedProperty.VULNERABLE_TO_INVALID_CURVE_EPHEMERAL, vulnerableEphemeral);
        report.putResult(AnalyzedProperty.VULNERABLE_TO_INVALID_CURVE_TWIST, vulnerableTwist);
        report.setInvalidCurveResultList(responses);
    }

}
