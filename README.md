# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 14-09-integrando-servico-de-catalogo-de-fotos-com-servico-de-armazenagem
git add .
git commit -m "Integrando o serviço de catálogo de fotos com o serviço de armazenagem"
git push origin 14-09-integrando-servico-de-catalogo-de-fotos-com-servico-de-armazenagem

git checkout master
git merge --no-ff 14-09-integrando-servico-de-catalogo-de-fotos-com-servico-de-armazenagem
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```