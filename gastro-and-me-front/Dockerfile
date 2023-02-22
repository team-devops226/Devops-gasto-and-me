# Build Stage
FROM node:16.18-alpine AS build
WORKDIR /app
COPY package*.json /app/
RUN npm install
RUN npm install -g @angular/cli@15.1.5
COPY ./ /app/
RUN npm run build


# Run Stage
FROM nginx:1.23.1-alpine
COPY default.conf /etc/nginx/conf.d/default.conf
COPY --from=build /app/dist /usr/share/nginx/html
