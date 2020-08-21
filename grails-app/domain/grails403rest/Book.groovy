package grails403rest

import grails.rest.Resource

@Resource(uri = '/books', formats = ['json', 'xml'])
class Book {
    String title
    static hasMany=[review: Review]
    static constraints = {
    }
}
