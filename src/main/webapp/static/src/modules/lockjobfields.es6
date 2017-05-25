import Util from 'modules/util.min';

export default class LockJobFields {

    constructor() {
        this.util = new Util();
        this.apiKey = '${apikey}';
        this.applicationRoot = '${applicationRoot}';

        this.fieldsToDisable = [
            'employmentType',
            'status',
            'title',
            'address',
            'city',
            'state',
            'zip',
            'countryID'
        ];
    }

    init() {
        let promises = [];

        promises.push(this.jobHasApprovedPlacement((jobHasApprovedPlacement) => {
            if(jobHasApprovedPlacement) {
                $.each(this.fieldsToDisable, (index, field) => {
                    this.util.disableField($('#editRow-'+field));
                });
            }
        }));

        return promises;
    }

    jobHasApprovedPlacement(callback) {
        let jobOrderID = $('[name="jobPostingID"]').val();

        $.ajax({
            type: 'GET',
            url: this.applicationRoot + '/custom/formscript/jobHasApprovedPlacement',
            data: {
                apiKey: this.apiKey,
                jobOrderID: jobOrderID
            },
            timeout: 5000,
            cache: false,
            dataType: 'jsonp',
            success: (data) => {
                if(data.success) {
                    callback(data.jobHasApprovedPlacement)
                } else {
                    console.error(data.error);
                }
            },
            error: (xhr, status, errorThrown) => {
                console.error(xhr.status + ' - ' + status + ' - ' + errorThrown);
            }
        })
    }

}