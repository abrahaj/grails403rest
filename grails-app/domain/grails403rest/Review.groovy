package grails403rest

import grails.rest.Resource

@Resource(uri = '/reviews', formats = ['json', 'xml'])
class Review {
    String description
    static belongsTo = [book: Book]
    static constraints = {
        book nullable: false
    }
}
